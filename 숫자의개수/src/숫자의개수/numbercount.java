package �����ǰ���;

import java.util.Scanner;

public class numbercount {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int A=input.nextInt();
		int B=input.nextInt();
		int C=input.nextInt();
		
		int result=A*B*C;
		String number=String.valueOf(result); // ��ȯ
		int answer[] =new int[10];
		
		for(int i=0;i<10;i++) {
			answer[i]=0;		// �ʱ�ȭ
		}
		
		
		
		for(int i=0;i<number.length();i++) {
			
			int s= number.charAt(i)-'0';	// �ƽ�Ű�� ��ȯ�ϸ� int���� �ȴ�.
			
			answer[s]++;		// �ϳ��� �̾Ƽ� �� ������ �ε����� ���� 
			
			
			
		}
		
		for(int i=0;i<10;i++) {
			
			System.out.println(answer[i]);
			
		}
		
		
		
		
		
		
	}

}
