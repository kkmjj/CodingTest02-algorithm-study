package 색종이;

import java.util.Scanner;

// 100*100 타월 안에 색종이를 x축 y축에 직각으로  10*10 색종이를 N 장 붙일때 (겹침 가능) 붙인 넓이를 구해라 

public class paper {
	
	
	
	public static void main(String arg[]) {
		int n;
		Scanner ss =new Scanner(System.in);
		
		n=ss.nextInt();
		// 색종이 수 입력 
		int paper[][]=new int[100][100];
		// 색종이 넓이 파악 
		
		for(int i=0;i<n;i++) {
			
			int sy=ss.nextInt();
			int sx=ss.nextInt();
			//색종이의 왼쪽 아래 x,y값
			for(int y=sy;y<=sy+9;y++) {
				for(int x=sx; x<=sx+9;x++) {
					paper[y][x]++;
				}
				
				
				
			}
			
		}
		
		int count=0;
		for(int i=0;i<=99;i++) {
			for(int j=0;j<=99;j++) {
			
			
			if(paper[i][j]>=1)count++;
			
		}
		}
		
		System.out.print(count);

		

}
}
