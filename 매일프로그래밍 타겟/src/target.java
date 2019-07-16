import java.util.*;

public class target {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int array[] =new int[n];
		for(int i=0 ;i<n;i++)
		{
			array[i]=input.nextInt();
		}
		int target=input.nextInt();
		/// ют╥б 
		 Map<Integer,Integer> map = new HashMap<>();
		    for(int i=0; i<n; i++) {
		        int complement = target - array[i];
		        if(map.containsKey(complement)) {
		        	System.out.print(map.get(complement)+""+ i);
		        }
		        map.put(array[i], i);
		    }

		
		
		
		
		
	}

}
