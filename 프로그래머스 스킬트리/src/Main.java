
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	   String skill ="ABCDE";
	   String skill_trees[] = {"AC","AB","G","C"};
	   // ���� �Է� ����

	 String result;
	 int learn;
	 boolean b=true;
	 int answer=0;
	 for(int i=0;i<skill_trees.length;i++)
	 {
		 Queue q =new LinkedList<String>();
		 b=true;
		 learn=0;
			
		 
		 for(int j=0;j<skill_trees[i].length();j++)
		 {
			 if(skill.contains(Character.toString(skill_trees[i].charAt(j)))) // ���� �Ǿ������� 
					 {
				 			if(skill.indexOf(Character.toString(skill_trees[i].charAt(j)))==learn)
				 				{
				 				q.add(Character.toString(skill_trees[i].charAt(j)));
				 				 learn++;
				 				
				 				}
				 			else if(skill.indexOf(Character.toString(skill_trees[i].charAt(j)))!=learn)
				 			{
				 				q.removeAll(q);
				 				b=true;
				 				break;
				 			}
				 			
				 			 b=true;
					 }
			 else
			 {
				 b=false;
			 }
			 
			 
			 
			 
		 }
		 
		 if(b==false||!q.isEmpty()) answer++; // �ƹ� ��ų�� �ȵ��� 
		 
		 
		 
		
		 
		 
		 
		 System.out.print(q);	 
	 }
	 
	     
	 System.out.print(answer);
	   
	   
	
	
	
	}

}
