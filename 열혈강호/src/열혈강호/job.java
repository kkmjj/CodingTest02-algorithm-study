package 열혈강호;
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
			if(b[there]==0||dfs(b[there])) // 일이 한번도 한적이 없는 일이거나 일을 한적이 있어도 
			{
				b[there]=s;    //i번째ㅐ 할수 있는일을 s사원이 하게된다.
				
				return true;
			}
		}
		
		
		
		return false;
	}

   public static void main(String[] args) {
	
	   Scanner input =new Scanner(System.in);
	   n=input.nextInt();
	   m=input.nextInt();
	   node =new int[n+1][m]; // [사원이름][할수있는일의 번수]
	   for(int i=1;i<=n;i++) {
		   
		   v=input.nextInt(); // 할수있는 일의 개수 
		   for(int j=0;j<v;j++) {
			   node[i][j]=input.nextInt(); // 일을 번째수에 넣는다.
		   }
		   
		   size[i]=v;
		   
	   }
	  
	   
   
   // 입력

	   for(int i=1;i<=n;i++) // 사원수 만큼 돌리고 
	   {
		   for(int j=0;j<2;j++) {
		   visit = new int[n+1];// 사원의 방문 여부 
		   if(dfs(i))count++;
		   }
	   }
	   
	   System.out.print(count);
	   
	   
	   
	   
	   
   
   }

}