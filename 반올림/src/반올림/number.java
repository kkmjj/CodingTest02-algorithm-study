package ¹Ý¿Ã¸²;

import java.util.*;
public class number {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String N=input.next();
      int result=Integer.parseInt(N);
      int max=N.length();
      int count=10;
     
      for(int i=1;i<max;i++)
      {
    	  
    	 int k= result%count; // 
    	
    	  
    	 if(k>=(5*count/10)) {
    		 result=result-k;
    		 result=result+count;
    	 }
    	 else
    	 {
    		result=result-k;
    	 }
    	  count=count*10;  
      }
   
      System.out.print(result);

   }

}