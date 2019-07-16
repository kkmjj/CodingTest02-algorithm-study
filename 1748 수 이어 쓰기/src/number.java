import java.util.*;
public class number {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String N=input.next();
		int a=Integer.parseInt(N);
		int b=input.nextInt();
		
		int ten=1;
		
		long result=0;
		
		for(int i=1;i<N.length();i++)
		{
			if(result<=b)
			{result+=9*ten*i;
			ten=ten*10;
			}
			else break;
			
		}
		
		int temp=(int) Math.pow(10,N.length()-1);
		
		if(a!=temp)result+=((a-temp)+1)*N.length();
		else if(a==temp)result+=N.length();
		
		
		System.out.print(result);
		
		

	}

}
