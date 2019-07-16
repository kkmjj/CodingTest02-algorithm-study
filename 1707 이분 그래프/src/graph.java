import java.util.*;
public class graph {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int k=input.nextInt(); // 테스트케이스
		
		for(int i=0;i<k;i++)
		{
			
			int v=input.nextInt();// 정점
			int e=input.nextInt(); // 간선
			boolean graph=true;
			
			int array[] =new int[v+1]; // 정점 왼쪽 오른쪽 만들기 [왼쪽]=오른쪽
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
