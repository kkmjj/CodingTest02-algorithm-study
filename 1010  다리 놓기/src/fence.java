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
		
				}// back ���� ��ŭ �ٸ� �� ����� ����Ǽ��� ����
				
				for(int f=2;f<=front;f++) {
					for(int b=f;b<=back;b++) { // back�� front�� ���� ���� ũ�ų� ����.
						
						for(int k=b;k>=f;k--) {
							A[f][b]+=A[f-1][k-1];
						}
						
					}
				}
				
				System.out.println(A[front][back]);
				
				
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
