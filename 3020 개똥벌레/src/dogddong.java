import java.util.Arrays;
import java.util.Scanner;

public class dogddong {
	
	public static void main(String args[]) {
		
		Scanner input =new Scanner(System.in);
		int n=input.nextInt(); // 14
		int m=input.nextInt();  //5
		long a[] = new long[m+1]; //�ּҰ� ���� ���ϱ� 
		
		long wall[][]=new long[n+1][m+1]; // [�� ��ġ����][���� ��ġ]
		long result=0;
		
		for(int i=1;i<=n;i++) { // 14�� ������ 
			 result =input.nextInt();
			
				if(i%2==0) {//¦�� ���϶�  m�� ���� ������ �� �ֱ� 
					
					for(int k=m;k>=result;k--) {
						wall[i][k]=1;
						a[k]++;
						
					}
					
					
				}
				else if(i%2!=0) { // Ȧ����°  �ؿ��� ���� �� ä��� 
					for(int k=1;k<=result;k++) {
						wall[i][k]=1;
						a[k]++;
					}
				}
			
		}
		// �Է� 
		long min=n;
		long count=1;
	
		Arrays.parallelSort(a);
		
		for(int i=2;i<=m;i++) {
			if(a[i]==a[1])count++;
		}
		System.out.print(a[1]+" "+count);
		
		
		
		
		
		
	}
	

}
