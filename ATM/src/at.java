import java.util.Arrays;
import java.util.Scanner;
public class at {


	

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int atm[]=new int[n]; // 자바에서는 배열크기 안에 변수 가능
		for(int i=0;i<n;i++) {
			atm[i]=input.nextInt();
		}
		// 입력
	Arrays.sort(atm);// Arrays에 들어있는 라이브러리 
		int temp=atm[0];
		for(int i=1;i<atm.length;i++) {
			atm[i]=atm[i]+atm[i-1];// 그리디 알고리즘 즉 뒤에 결과값을 저장 
			temp+=atm[i];
			System.out.println(temp);
			
		}
		
	System.out.println(temp);
	
		
		

	}

}
