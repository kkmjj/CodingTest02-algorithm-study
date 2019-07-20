import java.util.*;
public class Main {

	public static void main(String[] args) {
			String name="JAN";
			
			List<Integer> list =new ArrayList<>();
			
			list.add(0);
			list.add(26);// 초기 값 
			
			int current=0;
			int answer=0;
			
			for(int i=0;i<name.length();i++)
			{
				int temp =name.charAt(i)-65; // 아스키 코드 이용 

				if(!list.contains(temp))list.add(temp); // 리스트에 넣어두고 
				list.sort((o1,o2)->o1.compareTo(o2)); //작은 순서대로  넣어 두고 
				
				int index =list.indexOf(temp); // 넣은 위치 
				
				if(current==temp)continue;
				
				if(current<temp) // 현재 보다 높은 값이면 
				{
					// 현재값과 
					int front=list.get((index-1));
					int back=list.get((index+1));
					
					if(front!=current) // 현재에서 이미 들어간 문자로 이동 한 횟수
					{
						answer+=(list.indexOf(front)-list.indexOf(current));
						System.out.println(current+"이동 "+answer);
						
					}
					
					answer+=temp-front<back-temp?
							temp-front:back-temp;
					current=temp;
					
					System.out.println(current+" "+answer);
					
				}
				else //현재 위치보다 작으면 
				{
					if(index==0) {
						answer++;continue;
					}
					
					int front=list.get((index-1));
					int back=list.get((index+1));
				
					if(back!=current) // 현재에서 이미 들어간 문자로 이동 
					{
						answer+=(list.indexOf(current)-list.indexOf(back));
						System.out.println(current+"이동 "+answer);
						
					}
					answer+=temp-front<back-temp?
							temp-front:back-temp;
					current=temp;
					System.out.println(current+" "+answer);
				}
				
				
				
				
			
				
			}
			
			System.out.print(answer);
			
			
		
	}

}
