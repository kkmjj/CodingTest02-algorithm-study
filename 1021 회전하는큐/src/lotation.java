import java.util.*;
public class lotation {

	public static void main(String[] args) {

		
		Scanner input= new Scanner(System.in);
		int N=input.nextInt(); // ������ ����
		int M=input.nextInt(); // �̾Ƴ��� ���� 
		
		
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i=1;i<=N;i++)
		{
			list.add(i);
		} // ������� ��ũ����Ʈ�� �־��ֱ� 
	
		int cnt=0;
	
		for(int i=0;i<M;i++)
		{
			int number=input.nextInt();
			int temp=0;
			
		
		while(list.get(0)!=number)
			{
			if(list.indexOf(number)<=list.size()/2) // �̰��� �ϴ°� �߰����� �տ� ������ �������� �̵� 
			{
				temp= list.pollFirst(); // �տ� �κ��� ���� 
				list.addLast(temp); // ���󰣰��� �ڿ� ����
				
			
				
			}
			else if(list.indexOf(number)>list.size()/2) // �� �κ��̸� 
			{
				temp= list.pollLast();
				list.addFirst(temp);
				
			}
			cnt++;
		}
		
		
			list.pollFirst(); // �ش簪 ã���� �տ��� ���� 
		
			
		
			}
		
		
		System.out.println(cnt);
		
		
		
		

	}

}
