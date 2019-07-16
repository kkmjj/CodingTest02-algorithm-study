package 영역구하기;

import java.util.Arrays;
import java.util.Scanner;

public class answer {

		static int N;
		static int M;
		static int map[][];
	
		static int total=1;
		static void dfs(int y,int x){
			map[y][x]=1;
			int ax[]= {1,0,0,-1};
			int ay[]= {0,1,-1,0};
			
			for(int i=0;i<4;i++) {
				int nextx=x+ax[i];
				int nexty=y+ay[i];
				if(nextx>=0 && nexty>=0 &&nextx <N && nexty <M ) {
					
					if(map[nexty][nextx]==0) {
						dfs(nexty,nextx);
						total++;
					}
					
				}
				
				
				
			}
			
			
		}
		
		
		public static void main(String args[]) {
			
			Scanner input =new Scanner(System.in);
			 M=input.nextInt();
			 N=input.nextInt();
			int K=input.nextInt();
			map=new int[M][N];
			for(int i=0;i<K;i++) {
				int startx=input.nextInt();
				int starty=input.nextInt(); //(0,2) ->[2][0]
				int endx=input.nextInt();
				int endy=input.nextInt();// (4,4) ->(3,3)->[4][4]
				
				for(int a=starty;a<endy;a++) {
					for(int b=startx;b<endx;b++) {
						
				
						map[a][b]=1;
					}
				}
				
			}
			// 입력 

			int result[] =new int[N*M+1];
			int count=1;
		
			
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j]==0) {
					dfs(i,j);
					result[count]=total;
					total=1;
					count++;
					}
				}
			}
			
			
			System.out.println(count-1);
			Arrays.parallelSort(result);
			for(int i=1;i<result.length;i++) {
				if(result[i]!=0) {
				System.out.print(result[i]+" ");
				}
			}
			
			
			
		
			
			
			
			
			
			
			
			
			
		}
	}
