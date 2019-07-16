import java.util.*;
import java.math.*;

public class mario {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n[] =new int[10];
		int result=0;
		for(int i=0;i<10;i++)
		{
			n[i]=input.nextInt();			
			
		}
		// ют╥б 
	
			int i=0;
			while(result<=100)
			{
				result+=n[i];
				i++;
			}
			result=Math.abs(result-100)<=Math.abs(result-n[i-1]-100)?result:result-n[i-1];
			System.out.print(result);
				
				
				
			
			
			
			
			
			

		
		
		
		
		
		
		
		
		

	}

}
