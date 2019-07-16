package 연결요소의개수;


import java.util.Scanner;

public class answer {
	static int graph[][];
	static int N;
	static int M;
	static boolean v[];
	
	static void dfs(int x) {
		v[x]=true;
		for(int i=1;i<=N;i++) {
			if(graph[x][i]==1&&v[i]==false) {
				dfs(i);
				
			}
		}
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		 N=input.nextInt();
		 M=input.nextInt();
		
		graph =new int[N+1][N+1];
		v =new boolean[N+1];
		
		
		
		for(int i=0;i<M;i++) {
			int from=input.nextInt();
			int to =input.nextInt();
			
			graph[from][to]=1;
			graph[to][from]=1;
		}
		
	
		int count=0;
			for(int i=1;i<=N;i++) {
				if(v[i]==false) {
					count++;
					dfs(i);
					
				}
			}
		
			
		
		System.out.print(count);
		
		
		
		
		
		
		
		
		
	}

}
