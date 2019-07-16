package 미로탐색;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class search {
	
	public static class total{
		int x;
		int y;
		public total(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner ss =new Scanner(System.in);
		int n=ss.nextInt();
		int m=ss.nextInt();// 가로 세로 
		int consol[][]=new int[100][100];
		boolean v[][]=new boolean[100][100];
		v[0][0]=true;
		int count=1;
		int zx[]= {0,1,-1,0}; // 왼쪽 위 아래 오른쪽
		int zy[] = {-1,0,0,1};
		for(int i=0;i<n;i++) {
			String str = ss.next();
			for(int j=0;j<m;j++) {
				 consol[i][j] =str.charAt(j)-'0';


			
			}
		}
		// 입력
		Queue <total> q = new LinkedList<total>();
		q.offer(new total(0,0));
		while(true) {
		int size=q.size();
		for(int k=0;k<size;k++) {
			int x=q.element().x;
			int y=q.element().y;
			q.poll();
			if(x==n-1&&y==m-1) {
				System.out.print(count);
				break;
			}
		for(int i=0;i<4;i++) {
			int ax= x+zx[i];
			int ay=y+zy[i];
			
		
			if(ax>=0&&ax<n&&ay>=0&&ay<m&&!v[ax][ay]) {
			
				if(consol[ax][ay]==1) {
					q.offer(new total(ax,ay));
					v[ax][ay]=true;
				}
				
			}
		}
		}
		count++;
		}
	
		


}
	
}
