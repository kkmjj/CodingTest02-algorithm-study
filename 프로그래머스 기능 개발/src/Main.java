import java.util.*;
public class Main {

	public static void main(String[] args) {
			int [] progresses = {91,91,99};
			int []speeds = {1,1,1};
		  
			
			for(int i=0;i<progresses.length;i++)
			{
				progresses[i]=100-progresses[i];
			}
			
			Queue<Integer> q =new LinkedList<>();
			
			
			for(int i=-0;i<speeds.length;i++)
			{
				int temp=progresses[i]/speeds[i];
				
				if(progresses[i]%speeds[i]!=0)temp++;
			
				q.add(temp);
				
				
			}
			// ť�� �ش� �ð����� ��
			
			
			int count=1;
			int length=q.size(); // �տ��� ���� ��� 
			int max=q.poll();
			
			Queue<Integer> answerq =new LinkedList<>();
			
			if(q.isEmpty())answerq.add(1);
			
			if(q.size()==1&&max==q.poll())answerq.add(2);
			else
			{
			for(int i=1;i<length;i++)
			{
				if(max>=q.peek()) // ������ 
				{
					
					count++;
					if(q.size()==1)answerq.add(count);
					
				}
				else
				{
					System.out.println(count);
					answerq.add(count);
					count=1;
					if(q.size()==1)
						{
				
							answerq.add(1);
						}
					max=q.peek();
					
				}
				
				
				q.poll();
			}
			}
			
			System.out.print(answerq);
		
			
			int answer[] =new int[answerq.size()];
			
			
			for(int j=0;j<answer.length;j++)
			{
				
				answer[j]=answerq.poll();
				
			}
			
			

			

	}

}
