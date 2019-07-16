package 결혼식;

import java.util.Scanner;

public class friends {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int n=input.nextInt();	// 동기수	
	int f[][]=new int[n+1][n+1];
	int m=input.nextInt();	// 리스트수
	int count=0;
	int result[]=new int[n+1];

	for(int i=0;i<m;i++) {	// 리스트 만큼 돌린다 
		int a=input.nextInt();
		int b=input.nextInt();
			f[a][b]=1;	// a와b는 친구이다 1
			if(a==1) {
				result[b]=1;
				count++;
			}
			
	}
// 입력 받은 것을 친구를 1로 둠
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
