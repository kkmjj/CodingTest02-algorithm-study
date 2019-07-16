import java.util.*;
public class bubble {
	
	static class bub
	{
		int result;
		int index;
		public bub(int result,int index)
		{
			this.result=result;
			this.index=index;
			
		}
		public int compare(bub o)
		{
			if(this.result<o.result) {
				return 1;
			}
			
			return -1;
		}
	}


	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		bub a[] =new bub[n];
		
		for(int i=0;i<n;i++)	
		{
		a[i]=new bub(input.nextInt(),i);	
		}
		// 원소값 저장 
		
		Arrays.parallelSort();
		
		
		
		
		
		
		
	}


}


