import java.util.*;
public class all {
	static class th
	{
		int number;
		int gold;
		int silber;
		int dd;
		
		public th(int number,int gold,int silber,int dd )
		{
			this.number=number;
			this.gold=gold;
			this.silber=silber;
			this.dd=dd;
		}
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt(); // 국가수  찾고자 하는 등수 
		th a[] =new th[n+1];
		int g[]= new int[n+1];
		int s[] =new int[n+1];
		int d[] =new int[n+1];
		int result[][] =new int[n+1][n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=new th(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
		}
		// 금은 동 저장 
	
		
		
		
		
		
		
		

	}

}
