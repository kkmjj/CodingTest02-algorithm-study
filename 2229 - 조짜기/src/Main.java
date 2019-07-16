
import java.util.*;

public class Main {


   

	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	       int n=input.nextInt();
	       
	       int arr[] =new int[n+1];
	       int dp[] =new int[n+1];
	       
	       for(int i=1;i<=n;i++)
	       {
	    	   arr[i]=input.nextInt();
	    	   
	    	   int max=0;
	    	   int min=10001;
	    	   
	    	   for(int j=i;j>0;j--)
	    	   {
	    		   max=Math.max(max, arr[j]);
	    		   min=Math.min(min, arr[j]);
	    		  
	    		   dp[i]=Math.max(dp[i],max-min+dp[j-1]);
	    	      
	    	   }
	    	   
	    	   
	    	 }
		   System.out.println(dp[n]);
	  
	 }
       
}