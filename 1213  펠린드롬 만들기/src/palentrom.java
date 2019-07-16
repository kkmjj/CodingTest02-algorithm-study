import java.util.Arrays;
import java.util.Scanner;

public class palentrom {
	

	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
		String n=input.next();
		int a[] =new int[n.length()];
		int b[] =new int[n.length()];
		int c[] =new int[26];
		//문자 -'A' =int 형 
		int result=0;
		int max=26;
		for(int i=0;i<n.length();i++) {
			a[i]=n.charAt(i)-'A';
			c[n.charAt(i)-'A']++;
			if(max<n.charAt(i)-'A')max=n.charAt(i)-'A';
		}
		
		Arrays.parallelSort(a); // 사전순으로 정렬 
		boolean flag=true;
	
		int newa[]=new int[n.length()];
		int count=0;
		if(a.length%2==0) // 짝수면 
		{
			
			for(int i=0;i<a.length/2;i++) {
				b[i]=a[i+count];
				b[a.length-1-i]=a[i+count+1];
				count++;
				if(b[i]!=b[a.length-1-i]) flag=false;
			}
			
			if(flag) {
				for(int i=0;i<b.length;i++) {

					System.out.print((char)(b[i]+'A'));
				}
			}
			else 
			{
				System.out.print("I'm Sorry Hansoo" );	
			}
		}
		
	
		
		
		// 홀수 
		
		if(a.length%2!=0) // 홀수 
		{
			
			int temp=0;
		for(int i=0;i<max;i++)
		{
			if(c[i]%2!=0) {
				temp=i;
			
				count++;
			}
			
			if(count>1) {
				System.out.print("I'm Sorry Hansoo");
				temp=0;
				break;
			}
			
		}
			
		
		// 나와서 
		count=0;
		b[n.length()/2]=temp;
		boolean check = true;
		for(int i=0;i<a.length/2;i++) {
			if(temp ==a[i+count]&&check)
			{
				count++;
				check =false;
			}
			b[i]=a[i+count];
			b[a.length-i-1]=a[i+count+1];
			count++;
	
		}
		
		for(int i=0;i<b.length;i++) {

			System.out.print((char)(b[i]+'A'));
		}
	}
		
		
		
		
		
		}
		
		
	
}
