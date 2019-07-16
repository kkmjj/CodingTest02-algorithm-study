package 유기농배추;

import java.util.Scanner;

public class answer {

	static int map[][];
	static int M;
	static int N;
	static boolean v[][];
	
	
	static void dfs(int x, int y) {
		int ax[]= {1,0,0,-1};
		int ay[]= {0,-1,1,0};
		
		
		
		for(int i=0;i<4;i++) {
			int zx=x+ax[i];
			int zy=y+ay[i];
			
			if(zx>=0  && zy>=0 &&zx<N&&zy<M) {
				
				if(map[zx][zy]==1) {
					map[zx][zy]=0;
					dfs(zx,zy);
					
					
					
				}
				
				
			}
			
		}
		
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		for(int i=0;i<T;i++) {
			M=input.nextInt(); // 가로
			N=input.nextInt(); // 세로 
			int k=input.nextInt(); // 1개수 
		
			int count=0;
			map = new int[N][M];
			
			
			for(int j=0;j<k;j++) {
				int x=input.nextInt();
				int y=input.nextInt();
				
				map[y][x]=1;
			}
		
			
			for(int j=0;j<N;j++) {
				for(int l=0;l<M;l++) {
					if(map[j][l]==1) {
						System.out.println(j+" "+i+" "+count);
						dfs(j,l);
						count++;
					
					}
					
				}
				
				
			}
			
			System.out.println(count);
			
			
			
			
	
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
