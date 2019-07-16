
import java.util.*;

public class stickey {

	public static void main(String[] args) {
		int t;// 테스트 케이스
		int n;// 가로 길이 
		Scanner input =new Scanner(System.in);
	
		t=input.nextInt();
	
		
		for(int k=0;k<t;k++) {
			n=input.nextInt();
			int a[][]=new int[2][n+1];
			int dp[][]=new int[2][n+1];
		for(int j=0;j<2;j++) {
		for(int i=1;i<=n;i++) {
			a[j][i]=input.nextInt();
			
			
		}
		}
		//입력 
	
		  dp[0][1] = a[0][1];
          dp[1][1] = a[1][1];
          for(int i=2; i<=n; i++){
              dp[0][i] = Math.max(dp[1][i-1],dp[1][i-2] ) + a[0][i];
              dp[1][i] = Math.max(dp[0][i-1],dp[0][i-2] ) + a[1][i];
          }
          System.out.println(Math.max(dp[0][n], dp[1][n]));

		
		
		
		
		
		
		
		
		
		
		
		}

	}

}
