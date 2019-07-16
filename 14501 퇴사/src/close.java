import java.util.*;
public class close {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();

		int p[]=new int[n+1];
		int t[]=new int[n+1];
	for(int i=1;i<=n;i++)
	{
		t[i]=input.nextInt();
		p[i]=input.nextInt();
	
	}
		t[0]=0;
		p[0]=0;
		
	int dp[] =new int[n+1];


	dp[0]=0;
	for(int i=n;i>=1;i--)
	{
		int next=i+t[i];
		if(next >n+1) {
			dp[i]=dp[i+1];
		}
		
		else
		{

            dp[i] = Math.max(dp[i + 1], dp[next] + p[i]);

		}
		
	}
	
	System.out.print(dp[1]);
	
	
	
	
	}

}
