package ������;

import java.util.Scanner;

// 100*100 Ÿ�� �ȿ� �����̸� x�� y�࿡ ��������  10*10 �����̸� N �� ���϶� (��ħ ����) ���� ���̸� ���ض� 

public class paper {
	
	
	
	public static void main(String arg[]) {
		int n;
		Scanner ss =new Scanner(System.in);
		
		n=ss.nextInt();
		// ������ �� �Է� 
		int paper[][]=new int[100][100];
		// ������ ���� �ľ� 
		
		for(int i=0;i<n;i++) {
			
			int sy=ss.nextInt();
			int sx=ss.nextInt();
			//�������� ���� �Ʒ� x,y��
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
