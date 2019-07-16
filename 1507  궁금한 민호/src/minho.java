import java.util.*;
public class minho {
	
	
	
    public static void main(String args[])
    {
    
    	Scanner input =new Scanner(System.in);
    	int n=input.nextInt();
    	int a[][] =new int[n][n];
    	int check[][]=new int[n][n];
    	
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			a[i][j]=input.nextInt();
    			check[i][j]=a[i][j];
    			
    		}
    	}
    	// ют╥б 
    	int result=0;
    	for(int k=0;k<n;k++) {
    		for(int i=0;i<n;i++) {
        		for(int j=0;j<n;j++) {
        			
        			if(a[i][j]>a[i][k]+a[k][j]) 
        			{
        				result=-1;
        				break;
        			}
        			
        			
        			if(i==k||j==k)continue;
        			
        			if(a[i][j]==a[i][k]+a[k][j]) 
        			{
        				check[i][j]=0;
        			}
        			
        			
        			
        			
        		}
    		}
    		
    	}
    	
    	if(result==0) {
    	for(int i=0;i<n;i++) {
    		for(int j=i+1;j<n;j++) {
    			result+=check[i][j];
    		}
    	}
    	
    	
    	}
    	
    	System.out.print(result);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
