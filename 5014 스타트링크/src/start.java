import java.util.*;
public class start {
	static int max;
	static int start;
	static int end;
	static int up;
	static int down;
	

	 static int bfs(int n ,int m ) {
		 int count=0;
		 Queue<Integer> q = new LinkedList<>();
		 boolean v[] =new boolean[max+1];
		 q.offer(n);
		 while(true) {

			 int size =q.size();
			 for(int i=0;i<size;i++) 
			 {
				 n=q.element();
				 q.poll();
				 if(n==m) return count;
				 
				 if(n>max||down==0&&start>end||up==0&&start<down||n<1)
				 {
					 return -1;
				 }
				 
			
				 if(n+up<=max&&v[n+up]==false)
				 {
					 q.offer(n+up);
					 v[n+up]=true;
				 }
				 
				 if(n-down>=1&&v[n-down]==false)
				 {
					 q.offer(n-down);
					 v[n-down]=true;
				 }
				 
				 
				 
			 }
			 count++;
			
			
			 
			 
		 }
		}
			 
		 
		
		

	
	
	

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int cnt;
		max=input.nextInt();
		start=input.nextInt();
		end=input.nextInt();
		up=input.nextInt();
		down=input.nextInt();
		if(start==end)System.out.print(0);
		else
		{
			
		cnt=bfs(start,end);
		if(cnt==-1)
		{
			System.out.print("use the stairs");
		}
		else
		{
			System.out.print(bfs(start,end));
			
				
		}
		}
		
		
	
	}

}
