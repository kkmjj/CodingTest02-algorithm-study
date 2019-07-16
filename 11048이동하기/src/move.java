import java.util.*;

public class move {
	static int map[][];
	static int result;

	static int N,M;
	static int max=0;
	
	static void dfs(int x, int y)
	{
		
		int ax[]= {1,0,1};
		int ay[] = {0,1,1};
		
		
		for(int i=0;i<3;i++)
		{
			int newx=x+ax[i];
			int newy=y+ay[i];
			
			
			if(newx>=1&&newy>=1&&newx<=N&&newy<=M) // 범위 
				
			{
				result+=map[newx][newy];
		
				dfs(newx,newy);
				
			}
		
			
			
		}
		
		max=max<result?result:max;
		result=map[1][1];
		
		
		
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		 N=input.nextInt();
		 M=input.nextInt();
		
		map=new int[N+1][M+1];
		
		
		for(int i=1;i<=N;i++)
		{	
			for(int j=1;j<=M;j++)
		{
				map[i][j]=input.nextInt();			
		}
		}
		// 입력 
		result=map[1][1];
		dfs(1,1);
	
		
		System.out.print(max);
		
		
		

	}

}
