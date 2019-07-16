import java.util.*;
public class JUMP {
	static int N;
	static int map[][];
	static long dp[][];
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
			N=input.nextInt();
			
			map=new int[N+1][N+1];
			dp =new long[N+1][N+1];
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++)
			{
				map[i][j]=input.nextInt();
				
			}
		}
			// 입력 
		dp[1][1]=1;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++)
			{ // map 전체를 돌린다.
				if(dp[i][j]==0||(i==N&&j==N))continue;
				
				int result=map[i][j];
				int down=result+i;
				int right =result+j;
				
				if(down<=N)dp[down][j]+=dp[i][j];
				if(right<=N)dp[i][right]+=dp[i][j];
				
				
				
			}
				
		}
		
		
		System.out.print(dp[N][N]);
		

	}

}
