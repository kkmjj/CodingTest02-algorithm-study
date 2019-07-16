import java.util.Arrays;
import java.util.Scanner;

public class sensor {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int a[] = new int[n];
	        int m[] = new int[n-1];
	        
	        for(int i=0; i<n; i++)
	            a[i] = sc.nextInt();
	        
	        Arrays.sort(a);
	        
	        for(int i=1; i<n; i++) 
	            m[i-1] = a[i] - a[i-1];
	    
	        
	        for(int i=0; i<k-1; i++) {
	            int max = 0;
	            int idx = 0;
	            for(int j=0; j<n-1; j++) {
	                if(max < m[j]) {
	                    max = m[j];
	                    idx = j;
	                }
	            }
	            if(n != 1) m[idx] = 0;
	        }
	        
	        int sum = 0;
	        for(int i=0; i<n-1; i++)
	            sum += m[i];
	        
	        System.out.println(sum);
	    }

}
