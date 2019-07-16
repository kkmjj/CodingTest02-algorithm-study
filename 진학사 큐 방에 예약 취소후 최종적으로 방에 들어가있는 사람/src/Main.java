import java.util.*;
public class Main {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   int N=input.nextInt();
		   int k=input.nextInt();
		   
		   LinkedList<Integer> list =new LinkedList<Integer>();
		   
		   
		   for(int i=0;i<N;i++)
		   {
			   int front=input.nextInt();
			   int back =input.nextInt();
			   
			   if(back==1)
			   {
				   list.addLast(front);
			   }
			   else if(back==0)
			   {
				   int index=list.indexOf(front);
				   list.remove(index);
				   
			   }
			   
			  
			   
		   }
		   
		   
		   for(int i=0;i<k;i++)
		   {
			   System.out.print(list.get(i)+" ");
		   }
		   
		   
		   

	}

}
