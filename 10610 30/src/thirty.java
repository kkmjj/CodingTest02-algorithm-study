import java.util.Arrays;
import java.util.Scanner;

public class thirty {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String n=input.next();
		
		boolean flag =false;
		int sum=0;
		int th[]=new int[n.length()];
		
		for(int i=0;i<n.length();i++) {
			th[i]=n.charAt(i)-'0';
			sum+=n.charAt(i)-'0'; // int형으로 변환 
			
			if(n.charAt(i)-'0'==0) {
				flag=true;
			}
		}
		
		if(!flag||sum%3!=0) System.out.print(-1);
		
		if(sum%3==0&&flag) { // 0이 있고 3의 배수 
			Arrays.parallelSort(th);
			for(int i=n.length()-1;i>=0;i--) {
				System.out.print(th[i]);
			}
			
		}

	}

}
