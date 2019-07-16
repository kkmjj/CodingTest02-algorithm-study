package 숨박꼭질;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class search {

	
	 static int bfs(int n ,int m ) {
		 int count=0;
		 int ncount=0; //1초마다 m값을 증가 시킴
		 Queue<Integer> q = new LinkedList<>();
		 boolean v[] =new boolean[1000001];
		 q.offer(n);
		 while(true) {
			 int size =q.size();
			 for(int i=0;i<size;i++) {
				 n=q.element();
				 q.poll();
				 if(n==m) return count;
				 
				 if(n+1<100001&&v[n+1]==false)
				 {
					 q.offer(n+1);
					 v[n+1]=true;
				 }
				 
				 if(n-1>=0&&v[n-1]==false)
				 {
					 q.offer(n-1);
					 v[n-1]=true;
				 }
				 
				 if(2*n<=100000&&v[n*2]==false)
				 {
					 q.offer(n*2);
					 v[n*2]=true;
				 }
				 
				 
			 }
			 count++;
			 ncount++;
			 m=m+ncount;
			 
			 
			 
			 
		 }
		}
		
	
	
	
	
	
	public static void main(String[]args) {
		Scanner ss= new Scanner(System.in);
		int n,m;
		m=ss.nextInt();
		n=ss.nextInt();
	System.out.print(bfs(n,m));
	
	
	
	

}
}