import java.util.*;

/*
 ���� ����


Ʈ�� ���� �밡 ���� ���������� �� ���� �ٸ��� ������ ������ �ǳʷ� �մϴ�. ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�.
 Ʈ���� 1�ʿ� 1��ŭ �����̸�, �ٸ� ���̴� bridge_length�̰� �ٸ��� ���� weight���� �ߵ��ϴ�.
�� Ʈ���� �ٸ��� ������ ������ ���� ���, �� Ʈ���� ���Դ� ������� �ʽ��ϴ�.

���� ���, ���̰� 2�̰� 10kg ���Ը� �ߵ�� �ٸ��� �ֽ��ϴ�. ���԰� [7, 4, 5, 6]kg�� Ʈ���� ������� �ִ� �ð� �ȿ� 
�ٸ��� �ǳʷ��� ������ ���� �ǳʾ� �մϴ�.

 */
public class Main {

	public static void main(String[] args) {
		int bridge_length=2;
		int weight=10;
		int[] truck_weights= {7,4,5,6};
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<bridge_length;i++)q.add(0);
		
		// ť�� �̸� 0�� ��� �ΰ� 
		
		
		int sum=0;
		int answer=0;
		
		
		for(int i=0;i<truck_weights.length;i++)
		{
			
			sum-=q.poll(); // ť�� ���� ���鼭 sum���� ����ŭ ���� 
			if(sum +truck_weights[i] <weight) // ���� ���� ��ģ ���� ������ 
			{
				q.add(truck_weights[i]);
				sum+=truck_weights[i];
				
			}
			else
			{
				q.add(0);
				i--;
			}
			
			answer++;
			
			}
		
		answer=answer +bridge_length;
		
		System.out.print(answer);
		
		
		
		
		
		
		
		
		
		
		

	}

}
