import java.util.*;

public class Main {

	public static void main(String[] args) {
		int	heights[] = {6,9,5,7,4};
		
		int answer[] = new int[heights.length];
		
		
		for(int i=heights.length-1;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				if(heights[i]<heights[j])
				{
					answer[i]=j+1;
					break;
				}
				
			}
			
			
			
			
			
		}
		
	
		
		
		

	}

}
