package 한수;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n=input.nextInt(); // 숫자 입력
		int result=0;
		int a[] = new int[3];
	
		
		for(int i=1; i<=n;i++) {
			if(0<i&&i<100)result=i;
			else if(i==1000)break;
			else
			{
				int k=0;int t=i;
				while(t>0) {
					a[k]=t%10;
					t= t/10;
					k++;
				}
				if(a[0]-a[1]==a[1]-a[2]) result++;
			}
		}
		
		System.out.print(result);
		
		
	}

}
