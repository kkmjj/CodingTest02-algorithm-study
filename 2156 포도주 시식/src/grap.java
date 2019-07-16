import java.util.Scanner;

public class grap {

	public static void main(String[] args) {
		int N;
		Scanner input=new Scanner(System.in);
		N=input.nextInt();
		int grap[]=new int[N+1];
		int dp[]=new int[N+1];
		for(int i=1;i<=N;i++)
		{
			int g;
			grap[i]=input.nextInt();
		}
		
		dp[1]=grap[1];
		if(N>1)dp[2]=grap[1]+grap[2];
		
		
		for(int i=3;i<=N;i++) {
		dp[i]=grap[i]+dp[i-2] <grap[i]+grap[i-1]+dp[i-3]?
				grap[i]+grap[i-1]+dp[i-3]:grap[i]+dp[i-2] ;
				
		dp[i]=dp[i]<dp[i-1]?dp[i-1]:dp[i];
		
		}
			System.out.print(dp[N]);
		
		
		
		
		
		
		
		
	}

}
