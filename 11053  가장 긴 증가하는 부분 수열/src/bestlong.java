import java.util.Scanner;

public class bestlong {
	static int n;
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		
		int A[]=new int[n];
		int dp[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=input.nextInt();
		}
		// ют╥б 
		
		int result=0;
		
		for(int i=0;i<n;i++) {
			dp[i]=1;
			
			for(int j=0;j<i;j++) {
				
				if(A[i]>A[j]&&dp[i]<dp[j]+1) {
					dp[i]=dp[j]+1;
				}
				
				
			}
			
			result=result<dp[i]?dp[i]:result;
			
		}
		

		System.out.print(result);
		
		

	}

}
