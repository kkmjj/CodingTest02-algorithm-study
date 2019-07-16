import java.util.Arrays;
import java.util.Scanner;

public class dogddong {
	
	public static void main(String args[]) {
		
		Scanner input =new Scanner(System.in);
		int n=input.nextInt(); // 14
		int m=input.nextInt();  //5
		long a[] = new long[m+1]; //최소갑 개수 구하기 
		
		long wall[][]=new long[n+1][m+1]; // [이 위치에서][벽의 위치]
		long result=0;
		
		for(int i=1;i<=n;i++) { // 14번 돌려서 
			 result =input.nextInt();
			
				if(i%2==0) {//짝수 번일때  m의 부터 밑으로 벽 넣기 
					
					for(int k=m;k>=result;k--) {
						wall[i][k]=1;
						a[k]++;
						
					}
					
					
				}
				else if(i%2!=0) { // 홀수번째  밑에서 부터 벽 채우기 
					for(int k=1;k<=result;k++) {
						wall[i][k]=1;
						a[k]++;
					}
				}
			
		}
		// 입력 
		long min=n;
		long count=1;
	
		Arrays.parallelSort(a);
		
		for(int i=2;i<=m;i++) {
			if(a[i]==a[1])count++;
		}
		System.out.print(a[1]+" "+count);
		
		
		
		
		
		
	}
	

}
