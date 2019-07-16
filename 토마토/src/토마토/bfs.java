package 토마토;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
	
	public static class total{
		int x;
		int y;
		public total(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		
		
	}

	
	
	public static void main(String[] args) {
		int level=0;
		int n,m;
		int x[]= {0,1,-1,0}; // 우,아래 ,위,왼
		int y[]= {1,0,0,-1};
		int tomato[][] =new int[1001][1001];
		int temp[][]=new int[1001][1001];
		Queue <total> q = new LinkedList<total>();
		Scanner ss =new Scanner(System.in);
		m=ss.nextInt();
		n=ss.nextInt();
		for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
				tomato[i][j]=ss.nextInt();
				if(tomato[i][j]==1) 
					{
					q.offer(new total(i,j));
					}
			}
		}
		
		while(!q.isEmpty()) {
			int i=q.element().x;
			int j=q.element().y;
			q.poll();
			
			for(int k=0; k<4;k++) {
			int ax =i+x[k];
			int ay =j+y[k];
			if(ax>=0 && ay>=0 && ax<n && ay<m) {
				if(tomato[ax][ay]==0)
					{
					tomato[ax][ay]=1;
					temp[ax][ay]=temp[i][j]+1;
					level=temp[ax][ay];
					q.offer(new total(ax,ay));
					
					}
				
			}
			}
				
		}
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(tomato[i][j]==0)level=-1;
				
			}
			
		}
		
		
		
		
		System.out.print(level);


}

	
}