import java.util.*;

public class Main {

   public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int N=input.nextInt();
         boolean visit=true;
      
         
         
         for(int i=0;i<N;i++)
         {  
        Stack<Character> s = new Stack<Character>();
         String result = null;
        	 
        	 String a= input.next();
        	 
        	 for(int j=0;j<a.length();j++)
        	 {
        		if(a.charAt(j)=='(') {
        			s.push(a.charAt(j));
        		}
        		
        	
        		else if(a.charAt(j)==')'){
        			if(s.empty()) {
        				result="NO";
        				break;
        			}
        			else
        			{
        				s.pop();
        			}
        			
        			
        		}
        		 
        		 
        	 }
    
        	 
        	 if(result==null && s.empty()) result="YES";
        	 
        	 else if(!s.empty()) result="NO";
        	 
        	 
        	 System.out.println(result);
        	 
        	
        
        	 
        	 
        	 
        	 
         }
         
         
         
         

   }

}