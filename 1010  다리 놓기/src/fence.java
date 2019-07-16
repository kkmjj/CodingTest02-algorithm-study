import java.util.Scanner;

public class fence {
	static int n;

	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			int front=input.nextInt();
			int back=input.nextInt();
			int A[][]=new int[front+1][back+1];
		
				for(int f=1;f<=back;f++) {
					A[1][f]=f;
		
				}// back 개수 만큼 다리 를 만드는 경우의수가 있음
				
				for(int f=2;f<=front;f++) {
					for(int b=f;b<=back;b++) { // back은 front의 개수 보다 크거나 같다.
						
						for(int k=b;k>=f;k--) {
							A[f][b]+=A[f-1][k-1];
						}
						
					}
				}
				
				System.out.println(A[front][back]);
				
				
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
