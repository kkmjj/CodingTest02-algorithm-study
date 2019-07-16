package 안전영역;

import java.util.Scanner;

public class safe {
	static int N;
	static int map[][];
	static int check[][];
	static void dfs(int x,int y,int k) {
		int ax[]= {1,0,0,-1};
		int ay[]= {0,-1,1,0};
		
		check[x][y]=1;	
			for(int i=0;i<4;i++) {
				int newx=ax[i]+x;
				int newy=ay[i]+y;
				if(newx>=0 && newx<N && newy>=0 && newy<N) {
					if(map[newx][newy]>=k && check[newx][newy]==0) {
						dfs(newx,newy,k);
					}
					
					
				}
				
				
				
				
			}
			
		}
		
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int max=0;
		N=input.nextInt();
		map =new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j]=input.nextInt();
				max=max<map[i][j]?map[i][j]:max;
			}
		}

		// 입력 max는 최대 값 원소 
	
		int count=0;
		int result=1;
		for(int k=1;k<=max;k++) 
		{	check =new int[N][N];
			count=0;
			for(int i=0;i<N;i++) 
			{
				for(int j=0;j<N;j++) 
				{
					if(map[i][j]>=k&&check[i][j]!=1) 
					{
						count++;
						dfs(i,j,k);	
						
					}	
					
				}
			}

	
			
			result=result<count?count:result;
		}
		
		System.out.print(result);
		
		
		
		
		
		
		
		
		
		
	}

}
