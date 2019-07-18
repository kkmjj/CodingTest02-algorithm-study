import java.util.*;

public class Main {
	
	static List<String> list =new ArrayList<>();

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
	


	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		
		
		
		String numbers=input.next();
		// ют╥б

		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int i=0;i<numbers.length()-1;i++)
		{list.add(Integer.parseInt(Character.toString(numbers.charAt(i))));
		}
		
		
		System.out.print(list);
		
	
	}

}
