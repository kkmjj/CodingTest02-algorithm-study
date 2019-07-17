import java.util.*;

public class Main {
	
	static boolean swapv=true;

	static boolean prime(int n)
	{
		if(n==1||n==0)return false;
	 int end =(int)Math.sqrt(n);
	 
	 for(int i=2;i<=end;i++)
	 {
		 if(n%i==0) return false;
	 }
	 
	 return true;
	 
	}
	
	/*
	 
char[] c = originalString.toCharArray();

// Replace with a "swap" function, if desired:
char temp = c[0];
c[0] = c[1];
c[1] = temp;

String swappedString = new String(c);
	 */
	
	static String swap(String a, int scount)
	{
		char [] c =a.toCharArray();
		if(c[scount]==c[scount+1])
			{
			swapv=false;
			return a;
			}
		
		
		char temp =c[scount];
		c[scount]=c[scount+1];
		c[scount+1]=temp;
		
		String b = new String(c);
		
		System.out.println(b);
		
		swapv=true;
		
		return b;
	}
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		
		
		
		String numbers=input.next();
		// ют╥б
 		LinkedList<Integer>  list =new LinkedList<Integer>();
		
		
		int answer=0;
		int result=0;
		int scount=0;
		boolean v =true;
		String temp=numbers;
		

		
		
		while(v)
		{	
			if(scount==numbers.length()-1)
			{
				scount=0;
			}
		for(int i=0;i<numbers.length();i++)
			
		{   
			
			
			
			for(int count=i+1;count<=numbers.length();count++)
			{
				if(count==i+1&&numbers.charAt(0)=='0')continue;
					
					result=Integer.parseInt(numbers.substring(i,count));
				
		if(list.contains(result))continue;
								
				
			
				if(prime(result))
					{
					list.add(result);
					answer++;
					}
					
				}
			
		
			}
		
			numbers=swap(numbers,scount);
			scount++;
			
			
		
			if(numbers.equals(temp)&&swapv==true) {
				v=false;
			}
		
	}
		
		System.out.print(list);
		
		
	
	}

}
