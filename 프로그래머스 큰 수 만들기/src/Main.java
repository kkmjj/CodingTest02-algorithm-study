import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		String number ="1113111";
		int k=4;
		// ���� �׽�Ʈ ���̽� 
	   	String answer="";
	   	
		
			StringBuffer origin =new StringBuffer(number);
			// stringbuffer�� �ٲٱ� 
			
			int i;
		
			while(k!=0)
		
			{
				for(i=0;i<origin.length()-1;i++)
				{
				int front =
	                Integer.parseInt(Character.toString(origin.charAt(i)));				// ������ġ�� �� 
				int back=
	                Integer.parseInt(Character.toString(origin.charAt(i+1)));
				
				
		
				if(front<back)
					{
					k--;
					origin.deleteCharAt(i);
					System.out.println(origin);
			
					break;
					// �׺κ� ���� 
					
						
					}
				
				
				
				}
			}
				

			answer =origin.toString();
			System.out.print(answer);

		
		
		
	}
}
