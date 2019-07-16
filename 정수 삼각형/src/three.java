
import java.util.Arrays;
import java.util.Scanner;

public class three {

	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int n=input.nextInt(); // 개수  
			int a[][]= new int[n+1][n+1];
			int dp[][]=new int[n+1][n+1];
			for(int j=1;j<=n;j++) {
			for(int i=1;i<j+1;i++) {
				a[j][i]=input.nextInt();
				
			}
	}
			
			dp[1][1]=a[1][1];
			for(int j=2;j<=n;j++) {
				for(int i=1;i<j+1;i++) {
			
				if(i==1) {
					dp[j][i]=dp[j-1][i]+a[j][i];
					continue;
				}
				if(j==i) {
					dp[i][j]=dp[j-1][i-1]+a[j][i];
					continue;
				}
				// 양쪽끝
				else {
				
					dp[j][i]=dp[j-1][i-1]+a[j][i]<dp[j-1][i]+a[j][i]?
							dp[j-1][i]+a[j][i] : dp[j-1][i-1]+a[j][i];
						
						}
				
					
					
				}
				}
			
		
			
			
			Arrays.parallelSort(dp[n]); 
			System.out.print(dp[n][n]);
			


	}
}
