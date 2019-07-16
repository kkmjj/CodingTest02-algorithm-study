package 연구소;

import java.util.Scanner;

public class lab {
	//0 빈칸 1벽 2바이러스
	static int N;
	static int M;
	static int map[][];
	static class Cell{
		int x;
		int y;
		
		public Cell(int x,int y) {
			this.x=x;
			this.y=y;
		}
		
	}
	
	static void bfs(int count) {
		
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		N=input.nextInt();
		M=input.nextInt();
		map= new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j]=input.nextInt();
				
			}
			
		}
		// 입력 
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
			if(map[i][j]==2) {
				bfs();
			}
				
			}
			}
		
		
		
		
		
		
		
		
	}

}
