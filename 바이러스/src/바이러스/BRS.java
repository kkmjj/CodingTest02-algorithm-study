package 바이러스;

import java.util.Scanner;

public class BRS {
	static int B[][];
	static boolean v[];
	static int A;
	static int count=0;
	
	static void dfs(int x) {
		v[x]=true;
		System.out.print(x);	
			
			for(int j=1;j<=A;j++) {
				if(B[x][j]==1&&!v[j]) {
					
					dfs(j);
				
					count++;
					
			}
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		A =input.nextInt();
		B = new int[A+1][A+1];
		v =new boolean[A+1];
		int	N=input.nextInt();
		for(int i=0;i<N;i++) {
			int from=input.nextInt();
			int to =input.nextInt();
			B[from][to]=1;
			B[to][from]=1;
		}
		// 입력 
		
		
	dfs(1);
	System.out.print(count);	
		
		
		
		
		

	}

}
