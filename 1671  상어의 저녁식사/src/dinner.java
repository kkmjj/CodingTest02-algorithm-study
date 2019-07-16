import java.util.*;
public class dinner {
	static int n;
	static int node[][];
	static int visit[];
	static int vs[];
	static int b[] =new int[1010];
		static class shark{
			int k;
			int v;
			int know;
			
			public shark(int k,int v,int know)
			{
				this.k=k;
				this.v=v;
				this.know=know;
			}
		}
		
		static shark a[]; // 잡는 쪽 
		
		
		static public boolean dfs(int s)
		{
			if(visit[s]!=0)return false;
			visit[s]=1;
			for(int i=0;i<vs[s];i++)
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
	    	a= new shark[n+1];
	    	int k;
	    	int v;
	    	int know;
	    	
	    	for(int i=1;i<=n;i++) {
	    		k=input.nextInt();
	    		v=input.nextInt();
	    		know=input.nextInt();
	    		a[i]=new shark(k,v,know);
	    	}
	    	// 입력 받기 
	    	node =new int[n+1][n+1];
	    
	    	vs =new int[n+1];
	    	for(int i=1;i<n;i++) {
	    		
	    		for(int j=i+1;j<=n;j++)
	    		{
	    			if(a[i].k>=a[j].k&&a[i].v>=a[j].v&&a[i].know>=a[j].know) //앞에 상어가 클떄
	    			{
	    				
	    				node[i][vs[i]]=j;
	    				vs[i]++; // i상어의 먹이 개수 센다
	    			}
	    			else if(a[i].k<=a[j].k&&a[i].v<=a[j].v&&a[i].know<=a[j].know) // 뒤상어가 클때 
	    			{
	    				node[j][vs[j]]=i;
	    				vs[j]++;
	    			}
	    		}
	    	}
	    	int ret=0;
	    	for(int i=1;i<=n;i++)
	    	{
	    		for(int j=0;j<2;j++)
	    		{
	    		visit= new int[n+1];
	    		
	    		if(dfs(i))ret++;
	    		}	
	    	}
	    	System.out.print(n-ret);
	    		
	    	
	    	
	    	
	    
	    	
	    	
	    	
	    	
	    }
	 
}
	 
