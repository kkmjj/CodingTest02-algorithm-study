import java.util.*;
public class Main {

	public static void main(String[] args) {
			String name="JAN";
			
			List<Integer> list =new ArrayList<>();
			int answer=0;
		
			
			for(int i=0;i<name.length();i++)
			{
				
				
				
				int temp =name.charAt(i)-65; // �ƽ�Ű �ڵ� �̿� 
				
				answer+=temp; // �ش� ��ġ���� ���ϴ� ���� ��ŭ �̵� 
				
				
			
				
				
				answer++; // ���� ��ġ�� Ŀ�� �̵� 
			
				
			}
			
			System.out.print(answer);
			
			
		
	}

}
