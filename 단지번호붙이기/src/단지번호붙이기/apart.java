package 단지번호붙이기;

import java.util.Arrays;
import java.util.Scanner;

public class apart {
	
	static int map[][]=new int[25][25];
	static int ax[]= {0,1,-1,0};
	static int ay[] = {1,0,0,-1};
	static int visit[][]=new int[25][25];
	static int number=1;
	
	static void dfs(int a,int b) {
		visit[a][b]=1;
		
		for(int i=0;i<4;i++) {
			int x=a+ax[i];
			int y=b+ay[i];
			
			if(x>=0 && y>=0 && x<25 && y<25) {
			if(visit[x][y]==0&&map[x][y]==1) {
				number++; // 아파트수
				dfs(x,y);
				
			}
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int N=input.nextInt();
		
		for(int i=0;i<N;i++) {
			String a=input.next();
			for(int j=0;j<N;j++) {
				map[i][j]=a.charAt(j)-'0';
				visit[i][j]=0;
			}
			
		}
		// 입력
		
		
		
		int count=0;// 세대수 
		int result[]=new int[314];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
		
				if(map[i][j]==1 && visit[i][j]==0) {
					count++;
					dfs(i,j);
					result[count]=number;
					number=1;
				}
		
			}
			}
		
			System.out.println(count);
			Arrays.parallelSort(result);
			for(int i=1;i<314;i++) {
				if(result[i]>0)System.out.println(result[i]);
			}
				
		
		
		
		
	
	}

}
