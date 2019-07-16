import java.util.*;
public class lotation {

	public static void main(String[] args) {

		
		Scanner input= new Scanner(System.in);
		int N=input.nextInt(); // 원안의 개수
		int M=input.nextInt(); // 뽑아내는 개수 
		
		
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i=1;i<=N;i++)
		{
			list.add(i);
		} // 순서대로 링크리스트에 넣어주기 
	
		int cnt=0;
	
		for(int i=0;i<M;i++)
		{
			int number=input.nextInt();
			int temp=0;
			
		
		while(list.get(0)!=number)
			{
			if(list.indexOf(number)<=list.size()/2) // 뽑고자 하는게 중간보다 앞에 있으면 왼쪽으로 이동 
			{
				temp= list.pollFirst(); // 앞에 부분이 날라감 
				list.addLast(temp); // 날라간것을 뒤에 붙임
				
			
				
			}
			else if(list.indexOf(number)>list.size()/2) // 뒷 부분이면 
			{
				temp= list.pollLast();
				list.addFirst(temp);
				
			}
			cnt++;
		}
		
		
			list.pollFirst(); // 해당값 찾으면 앞에꺼 제거 
		
			
		
			}
		
		
		System.out.println(cnt);
		
		
		
		

	}

}
