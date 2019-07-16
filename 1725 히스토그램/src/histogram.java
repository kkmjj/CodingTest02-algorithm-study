import java.util.*;


public class histogram {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int N=input.nextInt();
		
		int dp[]= new int[N+3];
		
		int max=0;
		
		for(int i=1;i<=N;i++)
		{
			dp[i]=input.nextInt();
			max=max<dp[i]?dp[i]:max;
			
		}// ют╥б 
		
		int[] check =new int[max+1];
		int[] result=new int[max+1];
		
		int set=1;
		int resultS=0;
		
		do
		{
		      
		       
		      if (dp[set] > dp[set + 1])
		      {
		        
		          Arrays.fill(check, dp[set+1]+1, dp[set], 0);
		       
		         
		      }
		      

			
			
			
			
		}while(set++<=N);
		
		
		
		  for (int i = 1;i <= dp[set];i++)
	      {
	         check[i] += i;
	         result[i] =Math.max(result[i], check[i]);
	         resultS = Math.max(resultS, result[i]);
	      }
		
		
		System.out.print(resultS);
		
		

	}

}
