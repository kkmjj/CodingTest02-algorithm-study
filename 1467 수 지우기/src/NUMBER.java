
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
				 
				 if(front.charAt(i)<front.charAt(i+1))// �ڿ��� ��ũ�� 
				 {
					 
				 }
				 else if(front.charAt(i)>=front.charAt(i+1))
				 {
					 
					 for(int j=front.length()-1;j>=0;j--) // �ڿ��� ���� 
					 {
						 if(back.charAt(0)==front.charAt(j))
						 {
							 front=front.substring(0,j-1)+front.substring(j+1,front.length()-1);
							 back=back.substring(1);
						 }
					 }
					 
					 
					 
				 }
				 else // �������� ������  
				 {
					 front=front.substring(front.length()-1);// ������ ���� 
					 back=back.substring(1);
				 }
				 
				 
			 }
			 
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
	}

}
