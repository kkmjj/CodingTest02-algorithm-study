import java.util.*;

/*
  PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
  
  PriorityQueue는 넣는 순서와 상관 없이 
  값의 작은 숫자 대로 추출 해준다. 
  
 */
public class Main {

	public static void main(String[] args) {
		 int[] scoville= {1};
		 int K=5;
		 int answer=0;
		 
		 PriorityQueue<Integer> q =new PriorityQueue<Integer>();
		 
		 for(int a : scoville)
		 {
			 q.offer(a);
		 }
	     System.out.println(q);

	       int min=0;
	       int smin=0;
	       int number=0;
	       int length=q.size();
	       
	       
	       while (q.peek() <= K) {
	            if (q.size() == 1) {
	                break;
	            }
	            int a = q.poll();
	            int b = q.poll();


	            int result = a + (b * 2);

	            q.offer(result);
	            answer ++;
	        }
		 
		 
		 
	      System.out.print(answer);
	        
	        
	        
	}

}
