import java.util.Scanner;

public class stair {
	static int N;
	static int count=0;
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		N=input.nextInt();
		// �Է�
	
		int dp[][]=new int[101][10]; // ���� 9�϶� 
		
		for(int i=1;i<=9;i++) {
			dp[1][i]=1;
		}
		
		for(int i=2;i<=N;i++) {
			dp[i][0]=dp[i-1][1];
			dp[i][9]=dp[i-1][8];
			for(int j=1;j<=8;j++) {
				dp[i][j]=dp[i-1][j-1]+dp[i-1][j+1];
					
			}
		}
		
		
		for(int i=0;i<=9;i++) {
			count+=dp[N][i];
		}
		
		System.out.print(count%1000000000);
		
		
		

	}

}
