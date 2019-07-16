package 거스름돈;

import java.util.Scanner;

public class coin {
	
	public static void main(String arg[]) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		n=1000-n; // 1000원을 뺀값을 가지고 계산
		int count=0;
		
		
		
		while(n!=0) {
			
			count+=n/500;
			n=n%500;
			
			count+=n/100;
			n=n%100;
			
			count+=n/50;
			n=n%50;
			
			
			count+=n/10;
			n=n%10;
			
			
			count+=n/5;
			n=n%5;
			
			count+=n/1;
			n=n%1;
			
			
		}
		
		System.out.print(count);
		
		
	}

}
