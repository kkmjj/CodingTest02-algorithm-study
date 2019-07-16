package 이친수;

import java.util.Scanner;

public class twonumber {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int N;
		N=input.nextInt();
		// 입력
		
	long dp[] = new long[N+1];

	if(N==1) System.out.print("1");
	
	else if(1<N&&N<=90)
		{
		dp[1]=1;
		dp[2]=1;
		
		for(int i=3;i<=N;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		
		
		System.out.println(dp[N]);
		
		}
	}

}
