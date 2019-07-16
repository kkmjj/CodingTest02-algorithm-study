package 개미수열;
import java.util.Scanner;



public class ant {
	public static String Ant(String ss) {
		String s="";
		char c =ss.charAt(0);
		int count=1;
		
		for(int i=1;i<ss.length();i++) {
			if(c==ss.charAt(i)) {
				count++;
				
			}
			else
			{
				s=s+c+count;
				count=1;
				c=ss.charAt(i);
				
			}
			
		}
		
		s=s+c+count;
		
		
		
		return s;
	}
 
	public static void main(String arg[]) {
		String a="1";
		int n;
		Scanner c = new Scanner(System.in);
		
		n=c.nextInt();
		
		for(int i=0; i<n; i++) {
			a=Ant(a);
			if(i==n-2) {
					System.out.print(a);
			}
			
		}
		
		
	}
	
	
	
	

}