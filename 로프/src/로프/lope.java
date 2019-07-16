package 로프;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class lope {
	
	public static void main(String arg[]) {
		Scanner input =new Scanner(System.in);
		int n;
		n=input.nextInt();
		int A[] =new int [n];
		
		for(int i=0;i<n;i++) {
			A[i]=input.nextInt();
		}
		Arrays.parallelSort(A);
		// 입력 정렬 
		
		
		int max=0;
		
		for(int i=1;i<=n;i++) {
			
			max=max<A[n-i]*i?A[n-i]*i:max;
			
			
		}
		
		
		System.out.print(max);
		
		
		
		
	}

}
