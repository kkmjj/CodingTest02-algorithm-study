package 계단오르기;

import java.util.Scanner;

public class stairs {

	public static void main(String arg[]) {
	Scanner input =new Scanner(System.in);
	int n=input.nextInt();
	
	int stair[]=new int[n+1];
	int dp[]=new int[n+1];
	for(int i=1;i<=n;i++) {
		stair[i]=input.nextInt();
	}
	
	
	dp[1]=stair[1];
	dp[2]=stair[1]+stair[2];
	
	
	for(int i=3;i<=n;i++) {
		dp[i]=stair[i]+stair[i-1]+dp[i-3]<stair[i]+dp[i-2]?stair[i]+dp[i-2]:stair[i]+stair[i-1]+dp[i-3];
		
	}
	
	
	
	System.out.print(dp[n]);

	
	}
	
}
