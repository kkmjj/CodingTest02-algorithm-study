
import java.util.*;

public class NUMBER {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 String front=input.next();
		 String back=input.next();
		 
		 for(int i=0;i<front.length();i++)
		 {
			 
			 if(back.charAt(0)==front.charAt(i))
			 {
				 
				 if(front.charAt(i)<front.charAt(i+1))// 뒤에가 더크면 
				 {
					 
				 }
				 else if(front.charAt(i)>=front.charAt(i+1))
				 {
					 
					 for(int j=front.length()-1;j>=0;j--) // 뒤에서 부터 
					 {
						 if(back.charAt(0)==front.charAt(j))
						 {
							 front=front.substring(0,j-1)+front.substring(j+1,front.length()-1);
							 back=back.substring(1);
						 }
					 }
					 
					 
					 
				 }
				 else // 마지막이 같은것  
				 {
					 front=front.substring(front.length()-1);// 마지막 제거 
					 back=back.substring(1);
				 }
				 
				 
			 }
			 
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
	}

}
