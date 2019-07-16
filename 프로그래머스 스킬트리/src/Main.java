
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	   String skill ="ABCDE";
	   String skill_trees[] = {"AC","AB","G","C"};
	   // 문제 입력 예시

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
			 if(skill.contains(Character.toString(skill_trees[i].charAt(j)))) // 포함 되어있으면 
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
		 
		 if(b==false||!q.isEmpty()) answer++; // 아무 스킬이 안들어갈때 
		 
		 
		 
		
		 
		 
		 
		 System.out.print(q);	 
	 }
	 
	     
	 System.out.print(answer);
	   
	   
	
	
	
	}

}
