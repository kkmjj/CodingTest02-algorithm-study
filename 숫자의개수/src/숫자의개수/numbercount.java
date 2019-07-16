package 숫자의개수;

import java.util.Scanner;

public class numbercount {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int A=input.nextInt();
		int B=input.nextInt();
		int C=input.nextInt();
		
		int result=A*B*C;
		String number=String.valueOf(result); // 변환
		int answer[] =new int[10];
		
		for(int i=0;i<10;i++) {
			answer[i]=0;		// 초기화
		}
		
		
		
		for(int i=0;i<number.length();i++) {
			
			int s= number.charAt(i)-'0';	// 아스키로 변환하면 int형이 된다.
			
			answer[s]++;		// 하나씩 뽑아서 그 숫자의 인덱스를 증가 
			
			
			
		}
		
		for(int i=0;i<10;i++) {
			
			System.out.println(answer[i]);
			
		}
		
		
		
		
		
		
	}

}
