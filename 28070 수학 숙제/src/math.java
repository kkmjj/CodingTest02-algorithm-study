import java.util.*;
import java.math.BigInteger;
public class math {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		String a[] =new String[n];
		List<BigInteger> list = new ArrayList<BigInteger>();
		for(int i=0;i<n;i++) 
		{
			a[i]=input.next();
		}
		// 입력 
	
		
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length(); i++) {
				if (a[j].charAt(i) >= 48 && a[j].charAt(i) <= 57) {//숫자를 발견했을 때 시작
					int start = i;
					int end ;
					while(true) {
						if(i==a[j].length()-1) {//마지막 인덱스일 경우
							end = i+1;
							break;
						}else {//마지막 인덱스가 아닌경우
							i++;
							if(a[j].charAt(i) >= 48 && a[j].charAt(i) <= 57)//숫자
								continue;
							else {//문자
								end = i;
								break;
							}
						}
					}
					list.add(new BigInteger(a[j].substring(start,end))); // 리스트 에 범위 안에있는 string 넣기
				}
			}
		}
	
		Collections.sort(list);//리스트 정렬 
		for (BigInteger b : list) {	//리스트 for문 돌리기 
			System.out.println(b);	
		}

		
		

	}

}
