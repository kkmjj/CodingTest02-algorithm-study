import java.util.*;
public class padoban {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int T=input.nextInt();
		int a[] =new int[T+1];
		for(int i=1;i<=T;i++) // 테스트 케이스
		{
			int n=input.nextInt();
			int dp[] =new int[101];
		
			
			dp[1]=1;
			dp[2]=1;
			dp[3]=1;
			dp[4]=2;
			dp[5]=2;
			
			
			for(int j=6;j<=n;j++)
			{
				dp[j]=dp[j-5]+dp[j-1];
			}
			
			
			a[i]=dp[n];
			
			
			
			
			
		}
		
		for(int i=1;i<=T;i++)
		{
			System.out.println(a[i]);
		}

	
		
		

	}

}
