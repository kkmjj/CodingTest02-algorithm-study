package ���ã��;

import java.util.Scanner;

public class answer {
	static int map[][];

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N=input.nextInt();
		
		map=new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				map[i][j]=input.nextInt();
				if(map[i][j]==0) map[i][j]=10000;
			}
		}
		
		// �Է� 
		
		for (int k = 1; k <= N; k++)

		{

			for (int i = 1; i <= N; i++)

			{

				for (int j = 1; j <= N; j++)

				{

					if (map[i][k]==1 && map[k][j]==1)

						map[i][j] = 1;

				}

			}

		}//i -> j ���� ���尡�ų� ���� ������ ���ļ� j�� ���� �� 2���� ����Ǽ�




		for (int i = 1; i <= N; i++)

		{

			for (int j = 1; j <= N; j++)

			{

				System.out.print(map[i][j]+" ");

			}

			System.out.println();
		}

		
		
		
		
		
		
		
	}

}
