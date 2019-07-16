package 보물;

import java.util.Arrays;
import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int N=input.nextInt();
		int A[] =new int[N];
		int b[]=new int[N];
		
		
		for(int i=0;i<N;i++) {
			A[i]=input.nextInt();
			
		}
		for(int i=0;i<N;i++) {
			b[i]=input.nextInt();
			
		}
		// 입력
		
		Arrays.parallelSort(A);
		
		int index=0;
		
		int s=0;
		int max=0;
		for(int j=0;j<N;j++) {	
			
		for(int i=0;i<N;i++) {
			if(b[i]>max) {
				max=b[i];
				index=i;
			}
		}
		b[index]=0;
		System.out.println(max);
		System.out.println(A[j]);
			s+=max*A[j];
			max=0;
		}
		
		
System.out.print(s);
	}

}
