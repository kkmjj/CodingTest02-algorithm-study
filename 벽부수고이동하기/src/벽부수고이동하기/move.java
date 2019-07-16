package 벽부수고이동하기;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class move {

	
	static class Cell{
		int x;
		int y;
		int count;
		boolean wall;
		public Cell(int x,int y,int count, boolean wall) {
			this.x=x;
			this.y=y;
			this.count=count;
			this.wall=wall;
		}
	}


	public static void main(String arg[]) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		// n*m
		int map[][]=new int[n+1][m+1];
		
		for(int i=1;i<=n;i++) {
			String ss =input.next();
			for(int j=1;j<=m;j++) {
				map[i][j]=ss.charAt(j-1)-'0';
			}
		}
		// 입력
		int v[][][] =new int[n+1][m+1][2];
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=m;j++) {
				v[i][j][0]=0;
				v[i][j][1]=0;
			}}
		Queue<Cell> q =new LinkedList<>();
		q.offer(new Cell(1,1,1,false));
		v[1][1][0]=1;
		v[1][1][1]=1;
		int ax[]= {1,0,0,-1};
		int ay[]= {0,1,-1,0};
		int vs=0;
		
		while(!q.isEmpty()&&vs==0) {
			
			for(int i=0;i<q.size();i++) {
				int x=q.element().x;
				int y=q.element().y;
				int count=q.element().count;
				boolean wall=q.element().wall;
				q.poll();
				if(x==n&&y==m) {
					vs=count;
					break;
				}
				
				for(int j=0;j<4;j++) {
				int zx=x+ax[j];
				int	zy=y+ay[j];
					
					if(zx>0&&zx<=n&&zy>0&&zy<=m) {// 범위 안에서 
						
						if(map[zx][zy]==0&&wall==false&&v[zx][zy][0]==0)	// 벽을 안뿌시고 0일때
						{
							q.offer(new Cell(zx,zy,(count+1),false));
							v[zx][zy][0]=1;
						}
						if(map[zx][zy]==0&&wall==true&&v[zx][zy][0]==0)	// 벽을 뿌시고 0일때
						{
							q.offer(new Cell(zx,zy,(count+1),true));
							v[zx][zy][0]=1;
						}
						if(map[zx][zy]==1&&wall==true&&v[zx][zy][0]==0)	// 벽을 뿌시고 1일때
						{
							continue;
						}
						if(map[zx][zy]==1&&wall==false&&v[zx][zy][1]==0)	// 벽을 안뿌시고 1일때
						{
							q.offer(new Cell(zx,zy,(count+1),true));
							v[zx][zy][1]=1;
						}
						
						
						
					}
					
					
					
					
				}
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		if(vs==0)System.out.print(-1);
		else {
			System.out.print(vs);
		}
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}
