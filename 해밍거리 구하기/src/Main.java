import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		String a =input.next();
		String b =input.next();
		
		int cnt =a.length()-b.length();
		
		for(int i=0;i<cnt;i++)
		{
			b="0"+b;
		}
		cnt=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=b.charAt(i)) cnt++;
		}

		
		System.out.print(cnt);
		
	}

}
