package ������ȣ;
import java.util.*;
public class job {
	static int n;
	static int m;
	static int v;
	static int node[][];
	static int size[] =new int[1010];
	static int visit[];
	static int b[]=new int[1010];
	static int count=0;
	static public boolean dfs(int s)
	{
		if(visit[s]!=0)return false;
		visit[s]=1;
		for(int i=0;i<size[s];i++)
		{
			int there=node[s][i];
			if(b[there]==0||dfs(b[there])) // ���� �ѹ��� ������ ���� ���̰ų� ���� ������ �־ 
			{
				b[there]=s;    //i��°�� �Ҽ� �ִ����� s����� �ϰԵȴ�.
				
				return true;
			}
		}
		
		
		
		return false;
	}

   public static void main(String[] args) {
	
	   Scanner input =new Scanner(System.in);
	   n=input.nextInt();
	   m=input.nextInt();
	   node =new int[n+1][m]; // [����̸�][�Ҽ��ִ����� ����]
	   for(int i=1;i<=n;i++) {
		   
		   v=input.nextInt(); // �Ҽ��ִ� ���� ���� 
		   for(int j=0;j<v;j++) {
			   node[i][j]=input.nextInt(); // ���� ��°���� �ִ´�.
		   }
		   
		   size[i]=v;
		   
	   }
	  
	   
   
   // �Է�

	   for(int i=1;i<=n;i++) // ����� ��ŭ ������ 
	   {
		   for(int j=0;j<2;j++) {
		   visit = new int[n+1];// ����� �湮 ���� 
		   if(dfs(i))count++;
		   }
	   }
	   
	   System.out.print(count);
	   
	   
	   
	   
	   
   
   }

}