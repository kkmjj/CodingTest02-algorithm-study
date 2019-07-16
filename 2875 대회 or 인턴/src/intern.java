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
		   else if(w/2>m) // 남자의 개수가 여자2명 묶은거 보다 작으면 
		   {
			  max=m;
		   }
		  // 인턴제외한 최대팀 
		   
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
