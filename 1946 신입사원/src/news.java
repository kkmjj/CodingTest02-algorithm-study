import java.util.*;
public class news {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int T=input.nextInt();
		
		for(int i=1;i<=T;i++)
		{
			int result=1;
		
			
			int N=input.nextInt();// 5, 7
			int array[] =new int[N+1];
			
			for(int j=1;j<=N;j++)
			{
				
				int front=input.nextInt();
				int back=input.nextInt();
				array[front]=back;
					
			}
			
			int pivot=array[1]; // ���� 1���� ������������ ���� ���� ���� ã�´� 
			
			for(int j=2;j<=N;j++)
			{
				if(array[j]<pivot)
				{
					pivot=array[j];
					result++;
				}
			}
			
			
				
			
			System.out.println(result);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
