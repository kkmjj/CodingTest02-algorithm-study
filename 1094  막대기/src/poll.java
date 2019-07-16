import java.util.Scanner;

public class poll {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		
		int result=0;
		int count=0;
		int p=64;
		
	for(int i=0;i<7;i++) {
		if(n==p) {
			count=1;
			break;
		}
		if(result+p/2>n) { // 32 32 > n°ª  23
			
			p=p/2;
			
		}
		else if(result+p/2<=n) {
			count++;
			result+=p/2;
			p=p/2;
			
			
			
			
		}
		if(result==n)break;
		
	}
		
		
		
		System.out.print(count);
		

	}

}
