package 정렬;

import java.util.Scanner;

public class 삽입정렬 {

	public static void main(String[] args) {
		int i,j,index,temp;
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int arr[] = new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=input.nextInt();
			
		}
		// 입력
		
		for(i=0; i<arr.length-1;i++) {
			j=i;
			
			while(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
			
			
		}
		for(i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]);
		}
		
		
		
		
		
		
		

	}

}
