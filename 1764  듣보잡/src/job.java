import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class job {

	public static void main(String[] args) {
		int n,m;
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		m=input.nextInt();
		String a[] =new String[n];
		String b[] =new String[m];
		Set<String> nset= new HashSet<String>();
		for(int i=0;i<n;i++) {
			a[i]=input.next();
			nset.add(a[i]);
		}
		for(int i=0;i<m;i++) {
			b[i]=input.next();
		}
		// 입력 
		Set<String> set =new HashSet<String>();
		
			for(int j=0;j<m;j++) {
				if(nset.contains(b[j])) {
					set.add(b[j]);
				}
			}
			
		
	
		String Array[]= new String[set.size()];
		set.toArray(Array);
		Arrays.parallelSort(Array); // 단 어 정렬 
		System.out.println(set.size());
		for(int i=0;i<set.size();i++) {
			System.out.println(Array[i]);
		}
		
		
		

	}

}
