import java.util.*;
public class Main {

	public static void main(String[] args) {
		int [] priorities = {2,1,3,2};
		int location =2;
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<priorities.length;i++) q.add(priorities[i]);  // ť�� �ֱ� 
		
		
		Arrays.sort(priorities); // �Ųٷ� �ϸ� �������� 
		
		
		
		
		
		int cnt =priorities.length-1;
		int answer=0;
		
		int temp=priorities[0];
		
		while(!q.isEmpty())
		{
			temp=q.peek();

			if(temp==priorities[cnt-answer]) 
			{// �ִ� ���̸� 
				if(location==0) {// �� ���� ã���� �ϴ� ��ġ�� �Ǹ� 
					q.removeAll(q);
					answer++;
					break;
				}
				 
				q.poll();
				
				location--;
				answer++;
				if(location<0)location=q.size()-1;
			}
			else // �ִ밪�� �ƴϸ� 
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
