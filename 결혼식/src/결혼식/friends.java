package ��ȥ��;

import java.util.Scanner;

public class friends {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int n=input.nextInt();	// �����	
	int f[][]=new int[n+1][n+1];
	int m=input.nextInt();	// ����Ʈ��
	int count=0;
	int result[]=new int[n+1];

	for(int i=0;i<m;i++) {	// ����Ʈ ��ŭ ������ 
		int a=input.nextInt();
		int b=input.nextInt();
			f[a][b]=1;	// a��b�� ģ���̴� 1
			if(a==1) {
				result[b]=1;
				count++;
			}
			
	}
// �Է� ���� ���� ģ���� 1�� ��
	for(int i=2;i<=n;i++) {
			for(int j=2;j<=n;j++) {
				
				if(f[1][i]==1&&f[j][i]==1&&result[j]!=1) {
					count++;
					result[j]=1;
				}
					
				if(f[1][i]==1&&f[i][j]==1&&result[j]!=1) {
					count++;
					result[j]=1;
				}
			
				
					
			}
		
	}

	
	
	System.out.print(count);
	

	}

}
