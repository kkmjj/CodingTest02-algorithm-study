import java.util.*;
public class Main {

	public static void main(String[] args) {
		int [] priorities = {2,1,3,2};
		int location =2;
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<priorities.length;i++) q.add(priorities[i]);  // 큐에 넣기 
		
		
		Arrays.sort(priorities); // 거꾸로 하면 내림차순 
		
		
		
		
		
		int cnt =priorities.length-1;
		int answer=0;
		
		int temp=priorities[0];
		
		while(!q.isEmpty())
		{
			temp=q.peek();

			if(temp==priorities[cnt-answer]) 
			{// 최대 값이면 
				if(location==0) {// 그 값이 찾고자 하는 위치가 되면 
					q.removeAll(q);
					answer++;
					break;
				}
				 
				q.poll();
				
				location--;
				answer++;
				if(location<0)location=q.size()-1;
			}
			else // 최대값이 아니면 
			{
				temp =q.poll();
				q.add(temp);
				location--;

				if(location<0)location=q.size()-1;
				
			}
			
			
			
		}
		
		System.out.print(answer);
		
		
		

	}

}
