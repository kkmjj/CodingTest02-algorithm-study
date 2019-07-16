import java.util.*;

public class inrease {
	static int N;
	static int dp[][];

	
	
	
	
	public static void main(String arg[])
	{
		Scanner input =new Scanner(System.in);
		
		N=input.nextInt();
		
		
		
		dp = new int[N+1][10];
		
		for(int i=0;i<=9;i++)
		{
			dp[1][i]=1;
		}
		
		for(int i=2;i<=N;i++)
		{
		for(int j=0;j<=9;j++)
		{
			for(int k=j;k<=9;k++)
			{
			dp[i][j]+=dp[i-1][k];
			}
		}
		}
		
		int sum=0;
		for(int i=0;i<=9;i++)
		{
			sum+=dp[N][i];
		}
		
		System.out.print(sum%10007);
		
	}
}
