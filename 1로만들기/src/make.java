import java.util.Scanner;

public class make {


	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		
		
		int n=input.nextInt();
		int a[] =new int[n+1];
		// �Է�
		a[0]=0;
		a[1]=0;
		for(int i=2;i<=n;i++) {
			a[i]=a[i-1]+1;
			if(n%2==0) a[i]=(a[i]<a[i/2]+1)?a[i]:a[i/2]+1;
			if(n%3==0) a[i]=(a[i]<a[i/3]+1)?a[i]:a[i/3]+1;
			
			
			
		}
		
		System.out.println(a[n]);
		
		
		
		
	

		
		
		
	}

}
