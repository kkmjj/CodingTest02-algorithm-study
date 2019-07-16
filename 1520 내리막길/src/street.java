import java.util.*;

public class street {
	static int map[][];
	static int dp[][];
	

	static int N,M;

	static int dfs(int x, int y)
	{
		if(x==N&&y==M) return 1;
		
		if(dp[x][y]!=0) return dp[x][y];
		
		int ax[]= {0,1,-1,0};
		int ay[] = {1,0,0,-1};
		for(int i=0;i<4;i++)
		{
			int newx=x+ax[i];
			int newy=y+ay[i];
			if(newx>=1&&newy>=1&&newx<=N&&newy<=M) // 범위 
				
			{
				if(map[x][y]>map[newx][newy])
				{
					dp[x][y]+=dfs(newx,newy);		
				}
			}
		}
	return dp[x][y];
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		 N=input.nextInt();
		 M=input.nextInt();
		
		map=new int[N+1][M+1];
		dp =new int[N+1][M+1];
		for(int i=1;i<=N;i++)
		{	
			for(int j=1;j<=M;j++)
		{
				map[i][j]=input.nextInt();			
		}
		}
		// 입력 

		dfs(1,1);
	
		
	System.out.print(dp[1][1]);
		
		
		

	}

}
