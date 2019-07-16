

import java.util.*;

public class Main {
	
	static int N;
	static int arr[][];
	static int start[][];
	static int count=1;
	static int q;
	static int p;
	
	static void dfs(int x,int y)  // 맨 처음 거울 위치 위
	{
		
		
	 
		int ax[]= {0,1};
		int ay[] = {0,0};
		int newx;
		int newy;
		
		for(int i=0;i<2;i++)
		{
			newx =ax[i]+x;
			newy =ay[i]+y;
			
			if(newx>=0&&newy>=0&& newx<N&&newy<N)
			{
				
				if(arr[newx][newy]==33) // 대각선이 다시 거울 이 만나면 
				{
					count++;
					arr[newx][newy]=count;
				
					dfs(newx,newy);
				}
				
				if(arr[newx][newy]==35)
				{
					arr[newx][newy]=count;
					q=newx;
					p=newy;
					break;
				}
				
				
			}
			
		}
		
		count=0;
	
		
		
		
		
	}
	
	
	static void dfs_0(int x,int y)  // 맨 처음 거울 위치  왼쪽 
	{
		
		
	 
		int ax[]= {1,1};
		int ay[] = {-1,1};
		int newx;
		int newy;
		
		for(int i=0;i<2;i++)
		{
			newx =ax[i]+x;
			newy =ay[i]+y;
			
			if(newx>=0&&newy>=0&& newx<N&&newy<N)
			{
				
				if(arr[newx][newy]==33) // 대각선이 다시 거울 이 만나면 
				{
					count++;
					arr[newx][newy]=count;
				
					dfs(newx,newy);
				}
				
				if(arr[newx][newy]==35)
				{
					arr[newx][newy]=count;
					q=newx;
					p=newy;
					break;
				}
				
				
			}
			
		}
		
		count=0;
	
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			 N=input.nextInt();
			arr =new int[N][N];
			int x=0;
			int y=0;
			
			for(int i=0;i<N;i++)
			{
				String a=input.next();
				for(int j=0;j<N;j++)
				{
					arr[i][j]=a.charAt(j);
					if(arr[i][j]==35&&x==0&&y==0) 
					{
						x=i;
						y=j;
					}
				}
				
			}
			// 입력 
		
			
			if(x==0) //위에서 아래로 
			{	for(int j=x;j<N;j++)
				{
					if(arr[j][y]==33)dfs(j,y);
					
				}
				
			}
			else 
			{
				for(int j=y;j<N;j++)
				{
				
					if(arr[x][j]==33)dfs(x,j);
				}
			}
				
				
				
				
				
				
	System.out.print(arr[q][p]);
			
			
			
	
			
			
			

	}

}
