package 나이트의이동;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class move {
	static int N;
	static int with;
	static int map[][];
	static boolean v[][];
	
	static class Cell{
		int x;
		int y;
		
		Cell(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		N=input.nextInt();
		
		for(int i=0;i<N;i++) {
			
		with=input.nextInt();
		map=new int[with][with];
		v=new boolean[with][with];
		int from=input.nextInt();
		int to =input.nextInt();
		int endfrom=input.nextInt();
		int endto=input.nextInt();
		//입력 
		boolean w=true;
		Queue<Cell> q=new LinkedList<>();
		q.offer(new Cell(from,to));
		int count=0;
		while(!q.isEmpty()&&w) {
			
			for(int k=0;k<q.size();k++) {
			int x=q.element().x;
			int y=q.element().y;
			q.poll();
			
			if(x==endfrom&&y==endto) {
				w=false;
				break;
			}
			int ax[]= {2,1,-1,-2,-2,-1,1,2};
			int ay[]= {1,2,2,1,-1,-2,-2,-1};
			
			for(int j=0;j<8;j++) {
				int newx=x+ax[j];
				int newy=y+ay[j];
				
				if(newx>=0&&newy>=0&&newx<with&&newy<with) {
					
					if(!v[newx][newy]) {
					q.offer(new Cell(newx,newy));
					map[newx][newy]=map[x][y]+1;
					v[newx][newy]=true;
					}
				}
				
				
			}
		
			
			}
			
		}
		System.out.println(map[endfrom][endto]);
	
		
		
		
		
		
		}

	}

}
