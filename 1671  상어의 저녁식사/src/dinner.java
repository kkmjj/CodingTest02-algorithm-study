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
		
		static shark a[]; // ��� �� 
		
		
		static public boolean dfs(int s)
		{
			if(visit[s]!=0)return false;
			visit[s]=1;
			for(int i=0;i<vs[s];i++)
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
	    	// �Է� �ޱ� 
	    	node =new int[n+1][n+1];
	    
	    	vs =new int[n+1];
	    	for(int i=1;i<n;i++) {
	    		
	    		for(int j=i+1;j<=n;j++)
	    		{
	    			if(a[i].k>=a[j].k&&a[i].v>=a[j].v&&a[i].know>=a[j].know) //�տ� �� Ŭ��
	    			{
	    				
	    				node[i][vs[i]]=j;
	    				vs[i]++; // i����� ���� ���� ����
	    			}
	    			else if(a[i].k<=a[j].k&&a[i].v<=a[j].v&&a[i].know<=a[j].know) // �ڻ� Ŭ�� 
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
	 
