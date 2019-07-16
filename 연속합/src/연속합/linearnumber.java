package 연속합;

import java.util.Scanner;

public class linearnumber {


	
	

	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int N=input.nextInt();
		int dp[]= new int[N];
		int result[]=new int[N];
		for(int i=0;i<N;i++) {
			dp[i]=input.nextInt();
			
		}
		// 입력
		result[0]=dp[0];
			
		for(int i=1;i<N;i++) {
			
			if(result[i-1]+dp[i]>dp[i]) {
				result[i]=result[i-1]+dp[i];
			}
			else
			{
				result[i]=dp[i];
			}
			
		}
		int max=dp[0];
		
		for(int i=0;i<N;i++) {
			if(result[i]>max)
				max=result[i];
		
		
		}
		
		
		System.out.print(max);
		
		
		
	}

}
	


