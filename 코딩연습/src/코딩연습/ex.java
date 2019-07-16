package 코딩연습;

import java.util.*;
import java.util.Queue;

public class ex {

	static int result=0;
	static int max=0;
	static int min=9999999;
	static int arr[];
	static int dp[];
	
	public static int segment(int i) 
	{
		
		for(int j=i;j>0;i++)
		{
			max=Math.max(max,arr[j]);
			min=Math.min(min,arr[j]);
			result=max-min;
			result=dp[i-j]<result?dp[i-j]:result;
		}
		
	
		
		
		return result;
	}
   

	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	       int  N=input.nextInt();
	       
	        arr =new int[N+1];
	        dp =new int[N+1];
	    
	       for(int i=1;i<=N;i++)
	       {
	    	   arr[i]=input.nextInt();
	       }
	  
	    
	       for(int i=1;i<=N;i++)
	       {
	    	  dp[i]=segment(i); // 구간에 대한 최대값 
	    	   
	       }
	       
	       
	       
	       System.out.print(dp[N]);
	       
	       
	       
	     
	       
	 }
       
}