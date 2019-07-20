
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int citations[] = {3, 0, 6, 1, 5};
		
		int answer=0;
		
		List<Integer> list =new LinkedList<>();
		
		for(int a : citations)
		{
			list.add(a);
		}
		
		list.sort((o1,o2)->o2.compareTo(o1));

			  for(int i=0;i<list.size();i++)
			  {
				  if(list.get(i)<=answer)
				  {
					  
					  break;
				  }
				  answer++;
			  }
				  
				

			
			System.out.print(answer);
		
		
		
	}

}
