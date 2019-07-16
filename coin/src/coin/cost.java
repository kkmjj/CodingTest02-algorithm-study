package coin;

import java.util.Arrays;
import java.util.Scanner;

public class cost {

	public static void main(String args[]) {
		
		
		Scanner input =new Scanner(System.in);
		int N=input.nextInt();
		int k=input.nextInt();
		int m[]=new int[N];
		int count=0;
		for(int i=0;i<N;i++) {
			m[i]=input.nextInt();
		}

		
		Arrays.parallelSort(m);
	
		
		for(int i=N-1;i>=0;i--) {
			
			
		
			if(k>=m[i]) {
				count+=k/m[i]; 
				k=k%m[i];
			}
			if(k==0)break;
			
			
		}
	
		System.out.print(count);
		
		
		
		
		
		
		
		
		
		
	}
}
