import java.util.*;
public class Main {

	public static void main(String[] args) {
			String name="JAN";
			
			List<Integer> list =new ArrayList<>();
			
			list.add(0);
			list.add(26);// �ʱ� �� 
			
			int current=0;
			int answer=0;
			
			for(int i=0;i<name.length();i++)
			{
				int temp =name.charAt(i)-65; // �ƽ�Ű �ڵ� �̿� 

				if(!list.contains(temp))list.add(temp); // ����Ʈ�� �־�ΰ� 
				list.sort((o1,o2)->o1.compareTo(o2)); //���� �������  �־� �ΰ� 
				
				int index =list.indexOf(temp); // ���� ��ġ 
				
				if(current==temp)continue;
				
				if(current<temp) // ���� ���� ���� ���̸� 
				{
					// ���簪�� 
					int front=list.get((index-1));
					int back=list.get((index+1));
					
					if(front!=current) // ���翡�� �̹� �� ���ڷ� �̵� �� Ƚ��
					{
						answer+=(list.indexOf(front)-list.indexOf(current));
						System.out.println(current+"�̵� "+answer);
						
					}
					
					answer+=temp-front<back-temp?
							temp-front:back-temp;
					current=temp;
					
					System.out.println(current+" "+answer);
					
				}
				else //���� ��ġ���� ������ 
				{
					if(index==0) {
						answer++;continue;
					}
					
					int front=list.get((index-1));
					int back=list.get((index+1));
				
					if(back!=current) // ���翡�� �̹� �� ���ڷ� �̵� 
					{
						answer+=(list.indexOf(current)-list.indexOf(back));
						System.out.println(current+"�̵� "+answer);
						
					}
					answer+=temp-front<back-temp?
							temp-front:back-temp;
					current=temp;
					System.out.println(current+" "+answer);
				}
				
				
				
				
			
				
			}
			
			System.out.print(answer);
			
			
		
	}

}
