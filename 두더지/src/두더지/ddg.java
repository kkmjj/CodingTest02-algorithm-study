package 두더지;

import java.util.Arrays;
import java.util.Scanner;

public class ddg {
	static int map[][]=new int[30][30];

	static int with=1;
	static int dfs(int n, int m) {
		int ax[] = { 0,0,1,-1 };
		int ay[] = { 1,-1,0,0 };
		map[n][m] = 0;
		for (int i = 0; i < 4; i++) {
			int x = n + ax[i];
			int y = m + ay[i];
			if (x >= 0 && y >= 0)
			{
			if (map[x][y] == 1) {
				
					with++;
					dfs(x, y);
				}
			}
		}
		return with;


	}
		
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int count = 0;
		int n=input.nextInt();
		int result[] =new int [n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				map[i][j]=input.nextInt();


			}

		}
		// 입력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1)
				{
					count++;
					dfs(i, j);
					result[count] = with;
					with = 1;
				}

			}
		}

		for (int i = 1; i <= count; i++) {
			System.out.println(i+" "+ result[i]);
		}
		Arrays.parallelSort(result); // 자바 정렬 하는 법 
		
		for (int i = 1; i <= count; i++) {
			System.out.println(i+" "+ result[i]);
		}
		
		
		
		
		
		
	}
}
