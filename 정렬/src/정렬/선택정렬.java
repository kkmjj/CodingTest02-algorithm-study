package 정렬;

import java.util.Scanner;

public class 선택정렬 {


	public static void main(String[] args) {
		int index=0,temp;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[] =new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length;i++) {
			
			 int m =arr[i];
			for(int j=i;j<arr.length;j++) {
				if(m>arr[j]) { 
					m=arr[j];
					index =j;
				}
			
			}
			temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			
			
		}
	
	for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
	};

	
	sc.close();
	}
	
}
