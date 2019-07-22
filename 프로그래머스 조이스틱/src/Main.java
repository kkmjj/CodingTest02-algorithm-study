import java.util.*;
public class Main {

	public static void main(String[] args) {
			String name="JAN";
			
			List<Integer> list =new ArrayList<>();
			int answer=0;
		
			
			for(int i=0;i<name.length();i++)
			{
				
				
				
				int temp =name.charAt(i)-65; // 아스키 코드 이용 
				
				answer+=temp; // 해당 위치에서 원하는 숫자 만큼 이동 
				
				
			
				
				
				answer++; // 다음 위치로 커서 이동 
			
				
			}
			
			System.out.print(answer);
			
			
		
	}

}
