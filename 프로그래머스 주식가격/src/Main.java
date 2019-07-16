import java.util.*;
public class Main {

	public static void main(String[] args) {
		int []prices = {1,2,3,2,3};
		
		int  answer[] =new int[prices.length];
		int count=0;
		
		for(int i=0;i<prices.length;i++)
		{
			count=0;
			for(int j=i+1;j<prices.length;j++)
			{
				if(prices[i]<=prices[j])count++;
				else
				{
					count++;
					break;
				}
				
			}
			
			answer[i]=count;
			
			
			
		}
		
		
		
	 for(int i=0;i<answer.length;i++)
	 {
		 System.out.println(answer[i]);
	 }
		
		
		
		

	}

}
