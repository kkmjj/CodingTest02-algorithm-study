import java.util.*;
public class treasuer {
	static int n,m;
	static int map[][];
	static int result=0;

	
	static class cell
	{
		int x,y,cnt;
		public cell(int x,int y,int cnt)
		{
			this.x=x;
			this.y=y;
			this.cnt=cnt;
			
		}
	}
	
	private static int max(int a,int b){return a>b?a:b;}
	
	static void bfs(int a,int b)
	{
		
		int ax[]= {0,0,1,-1};
		int ay[]= {1,-1,0,0};
		
		Queue<cell> q =new LinkedList<>();
		
		q.add(new cell(a,b,0));
		  boolean[][] visited = new boolean[n+1][m+1];
	        visited[a][b] = true;
	        while(!q.isEmpty()){
	        	 cell t = q.poll();
	        	 result = max(result,t.cnt);
	            for(int i=0;i<4;i++){
	            	int newx = t.x+ax[i];
	            	int newy =t.y+ay[i];
	                if(newx<1 || newy<1 || newx>n || newy>m) continue;
	                if(map[newx][newy]=='W'-'0') continue;
	                if(visited[newx][newy]) continue;
	                visited[newx][newy]= true;
	                q.add(new cell(newx,newy,t.cnt+1));
	            }
	        }

		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		m=input.nextInt();
	    map=new int[n+1][m+1];

	 
		
		for(int i=1;i<=n;i++) {  // 문자 5줄 
			String ss =input.next();
			for(int j=1;j<=m;j++) {
				map[i][j]=ss.charAt(j-1)-'0';
			}
		}
		// 입력 
	
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(map[i][j]=='L'-'0') // 만약 L이면 
				{
						bfs(i,j);
				}
				
			}
		}
		
		
		System.out.print(result);
		
		
		
		
	}

}
