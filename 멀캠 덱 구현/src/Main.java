

import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		
			Deque<Integer> d = new ArrayDeque<>();
			
			Scanner input =new Scanner(System.in);
			// 문제 입력 
			int N=input.nextInt();
			
			for(int i=N;i>=1;i--)
			{
				d.addLast(i);
			}
			// 넣어주고 
			System.out.println(d);
			int temp=0;
			
			while(!d.isEmpty())
			{
				int cnt =d.peekFirst()/2;
			
				
				for(int i=0;i<cnt;i++)// 처음 2로 나눈 몫 만큼 돌리기 
				{
					temp=d.pollLast(); // 마지막 꺼를 뽑아 내서 
					d.addFirst(temp);
				}
				
				
				System.out.print(d.pollLast()+" ");
				
				
			}
		
		
		
		
		
		
	}

}
