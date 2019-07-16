import java.util.*;

public class square {
	static int map[][];
	static int dp[][];
	
	static int min(int x,int y,int z)
	{
		x=x<y?x:y;
		x=x<z?x:z;
		return x;
	}
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		map =new int[n+1][m+1];
		dp = new int[n+1][m+1];
		
		for(int i=1;i<=n;i++)
		{
			String s=input.next();
			for(int j=1;j<=m;j++)
			{
				
				map[i][j]=s.charAt(j-1)-'0';
				
			}
		}
		// 입력 
		
		int max=0;
		int result=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(map[i][j]==1) {
					result=min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]); // 가장 작은값 구하고
					dp[i][j]=result+1;
				}
				if(max<dp[i][j])max=dp[i][j];
			}
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(dp[i][j]);
			}
			System.out.println("");
		}
			
		
		
		
		System.out.print(max*max);
		
		
		
		
		
		
		
		
	
	}

	
}
