import java.util.*;

public class Main {

	static boolean prime(int n)
	{
	 int end =(int)Math.sqrt(n);
	 
	 for(int i=2;i<=end;i++)
	 {
		 if(n%i==0) return false;
	 }
	 
	 return true;
	 
	}
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		
		
		
		String numbers=input.next();
		// 입력

   		LinkedList<Integer>  list =new LinkedList<Integer>();
		
		Stack<String> stack =new Stack<>();
		int length=numbers.length();
		int answer=0;
		int result=0;
		
		
		for(int i=0;i<length;i++)
			
		{   
			stack.push(Character.toString(numbers.charAt(i))); // 나중에 뒤에서부터 push하려고 사용 
			
			
			
			for(int count=i+1;count<=length;count++)
			{
				if(count==i+1&&numbers.charAt(0)=='0')continue;
					
				
				
		if(list.contains(result))continue;
								
				list.add(result);
			
				if(prime(result))answer++;
					
				}
			
		
			}
		
	
		
		
		
		
	
	}

}
