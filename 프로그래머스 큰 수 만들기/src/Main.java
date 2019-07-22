import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		String number ="1113111";
		int k=4;
		// 문제 테스트 케이스 
	   	String answer="";
	   	
		
			StringBuffer origin =new StringBuffer(number);
			// stringbuffer로 바꾸기 
			
			int i;
		
			while(k!=0)
		
			{
				for(i=0;i<origin.length()-1;i++)
				{
				int front =
	                Integer.parseInt(Character.toString(origin.charAt(i)));				// 현재위치의 값 
				int back=
	                Integer.parseInt(Character.toString(origin.charAt(i+1)));
				
				
		
				if(front<back)
					{
					k--;
					origin.deleteCharAt(i);
					System.out.println(origin);
			
					break;
					// 그부분 제거 
					
						
					}
				
				
				
				}
			}
				

			answer =origin.toString();
			System.out.print(answer);

		
		
		
	}
}
