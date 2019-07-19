import java.util.*;
public class Main {

	public static void main(String[] args) {
		String arrangement= "()(((()())(())()))(())";
		// 문제 예시 
		
		
		Stack n =new Stack();
		
		int answer=0;
		boolean r=false;
	
		
		
		for(int i=0;i<arrangement.length();i++)
		{
			
			if(arrangement.charAt(i)=='(')
			{
				n.add('(');
				r=true;
				
			}
			else if(arrangement.charAt(i)==')')
			{
				n.pop();
				if(r)
				{
					answer+=n.size();
				}
				else
				{
					answer++;
				}
				
				r=false;
				
				
			}
			
			
			
			
		}
		
		System.out.print(answer);
		
		
		

	}

}
