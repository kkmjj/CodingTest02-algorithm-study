import java.util.*;
public class graph {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int k=input.nextInt(); // �׽�Ʈ���̽�
		
		for(int i=0;i<k;i++)
		{
			
			int v=input.nextInt();// ����
			int e=input.nextInt(); // ����
			boolean graph=true;
			
			int array[] =new int[v+1]; // ���� ���� ������ ����� [����]=������
		    HashSet<Integer> set = new HashSet<>();
			for(int j=0;j<e;j++)
			{
				
				int index=input.nextInt();
				int result=input.nextInt(); 
				array[index]=result;
				
				if()continue;
				
				
				
				
				}
			
			
			
			
			
			
			if(graph==true)System.out.println("YES");
			else System.out.println("NO");
			
			
			
			
			
			
			
			
			
			
			
		}
		

	}

}
