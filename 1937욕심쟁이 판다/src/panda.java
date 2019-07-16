import java.util.Scanner;

public class panda {

	static int n;
	static int map[][];
	static int v[][];
	static int result=0;


	static void dfs(int x,int y) {
		int value=0;
		int ax[]= {0,1,-1,0};
		int ay[]= {1,0,0,-1};
	
		for(int i=0;i<4;i++) {
			int newx=ax[i]+x;
			int newy=ay[i]+y;
			
			if(newx>0&&newy>0&&newx<=n&&newy<=n) {
				
				if(map[x][y]<map[newx][newy]) {
					if(v[newx][newy]==0)dfs(newx,newy);
					if(value<v[newx][newy])value=v[newx][newy];
					
					
				}
					
			}	
			
		}
		
		v[x][y]=value+1;
	
		result=result<v[x][y]?v[x][y]:result;
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		n=input.nextInt(); 
		map=new int[n+1][n+1];
		v =new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				map[i][j]=input.nextInt();
				
			}
		}
		// ют╥б 

		v =new int[n+1][n+1];
		
	for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(v[i][j]==0)dfs(i,j);
							
					}
		
			}
				
		System.out.print(result);
	
	}

}
