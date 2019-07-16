package 적록색약;

import java.util.Scanner;

public class RGB {
	static int N;
	static int map[][];
	static boolean v[][];
	
	static void bfs(int x,int y) {
		int ax[]= {1,0,0,-1};
		int ay[]= {0,-1,1,0};
		v[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int newx=x+ax[i];
			int newy=y+ay[i];
			
			if(newx>=0&&newy>=0&&newx<N&&newy<N) {
				
				if(map[x][y]==map[newx][newy]&&!v[newx][newy]) {
					
					bfs(newx,newy);
				}
				
				
				
			}
			
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		N=input.nextInt();
		map= new int[N][N];
		v =new boolean[N][N];
		for(int i=0;i<N;i++) {
			String a=input.next();
			for(int j=0;j<N;j++)
			{
				map[i][j]=a.charAt(j)-'A';
			}
		}
		//입력 
		int normalcount=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
			{
		
				if(!v[i][j]) {
				bfs(i,j);
				normalcount++;
				
				}
				if(map[i][j]==17)map[i][j]=6;
				
			}
		}
		
		System.out.println(normalcount);
		
		int RGcount=0;
		v=new boolean[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
			{
				
				if(!v[i][j]) {
					bfs(i,j);
					RGcount++;
					}
			}
			
		}
		
		System.out.println(RGcount);
		
		
		
		
		
		
		
	}

}
