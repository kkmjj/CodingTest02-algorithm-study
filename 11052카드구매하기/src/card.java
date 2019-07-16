import java.util.Arrays;
import java.util.Scanner;

public class card {
	static int n;
	
	
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		
		int result[]= new int[n+1];
		int dp[]=new int[n+1];

		for(int i=1;i<=n;i++) {
			result[i]=input.nextInt();
	
		}
		// ют╥б 
		
	
		int max=dp[1];
		dp[1]=result[1];
		dp[0]=0;
		
		for(int j=2;j<=n;j++) {
		for(int i=1;i<=j;i++) {
			
			dp[j]=Math.max(result[i]+dp[j-i],dp[j]);
		}
		}
		System.out.print(dp[n]);
	
		
		
		

	}

}
