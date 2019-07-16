import java.util.*;

public class robot {
	static int N;
	static int M;
	static int map[][];
	static int dp[][];
	static int temp[][];


	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		N=input.nextInt();
		 M=input.nextInt();
		map= new int[N+2][M+2];
		dp= new int[N+2][M+2];
		temp =new int[2][M+2];

		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=M;j++)
			{
				map[i][j]=input.nextInt();
			}
		}
		
			// �Է� 
		dp[1][1]=map[1][1];
		
		for(int i=2;i<=M;i++) {
			dp[1][i]=dp[1][i-1]+map[1][i]; // ù���� ���ʿ��� ���������� ���� �ۿ� ����
			
		}
		
		for(int i=2;i<=N;i++) // 2���� �ٺ��� ���� ������ ���ؼ� ū�� ���ϱ� 
		{
			temp[0][0]=dp[i-1][1];
			for(int j=1;j<=M;j++)
			{
				temp[0][j]=Math.max(temp[0][j-1],dp[i-1][j])+map[i][j];
			}
			temp[1][M+1]=dp[i-1][M];
			for(int j=M;j>=1;j--)
			{
				temp[1][j]=Math.max(temp[1][j+1],dp[i-1][j])+map[i][j];
			}
			
			
			for(int j=1;j<=M;j++)
			{
				dp[i][j]=Math.max(temp[0][j], temp[1][j]);
			}
			
			
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++)
			{
				System.out.print(dp[i][j]+" ");
					
			}	
			System.out.println();
		}
		
		
	
		
		
		
	}

}
