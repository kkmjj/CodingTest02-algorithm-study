import java.util.*;
public class intern {

	public static void main(String[] args) {
		  Scanner input =new Scanner(System.in);
		   int w=input.nextInt();
		   int m=input.nextInt();
		   int k=input.nextInt();
		   
		   int max=0;
		   if(w/2<=m)
		   {
			   max=w/2;
		   }
		   else if(w/2>m) // ������ ������ ����2�� ������ ���� ������ 
		   {
			  max=m;
		   }
		  // ���������� �ִ��� 
		   
		 	k-=(w-max*2);
		 	k-=(m-max); 
		   while(k>0)
		 	{		
		
			   max--;
			   k=k-3;
		 	
		 		
		 	}
		  
		   System.out.print(max);
		   
		   
		   
		   
		   
		   
		   
	}

}
