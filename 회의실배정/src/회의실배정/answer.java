package 회의실배정;

import java.util.Arrays;
import java.util.Scanner;

public class answer {
	
	static public class a{
		int from;
		int to;
		
		public a(int from,int to) {
			this.from=from;
			this.to=to;
		}
	}

	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		int N=input.nextInt();
		a []each =new a[N];
		int max=0;
		for(int i=0;i<N;i++) {
			int from=input.nextInt();
			int to =input.nextInt();
			each[i] = new a(from,to); // 객체에 각각 넣는다 .
			
		}
	Arrays.sort(each,(s1,s2)->s1.to==s2.to ?Integer.compare(s1.from, s2.from)
											:Integer.compare(s1.to, s2.to));
	// 끝나는시간 정렬  끝나는시간 같으면 앞시간으로 정렬 
	int count=1;
	int pivot=each[0].to;
	
		for(int j=1;j<N;j++) {
			if(pivot<=each[j].from) {
				count++;
				pivot=each[j].to;
			
			}
		
		}
		
		
		System.out.print(count);
		
		
		
		
		
		
		
	}
}
