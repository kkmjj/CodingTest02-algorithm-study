

import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		
			Deque<Integer> d = new ArrayDeque<>();
			
			Scanner input =new Scanner(System.in);
			// ���� �Է� 
			int N=input.nextInt();
			
			for(int i=N;i>=1;i--)
			{
				d.addLast(i);
			}
			// �־��ְ� 
			System.out.println(d);
			int temp=0;
			
			while(!d.isEmpty())
			{
				int cnt =d.peekFirst()/2;
			
				
				for(int i=0;i<cnt;i++)// ó�� 2�� ���� �� ��ŭ ������ 
				{
					temp=d.pollLast(); // ������ ���� �̾� ���� 
					d.addFirst(temp);
				}
				
				
				System.out.print(d.pollLast()+" ");
				
				
			}
		
		
		
		
		
		
	}

}
