import java.util.*;
public class Main {
	
	/*
 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.

���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.

0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ�
 return �ϵ��� solution �Լ��� �ۼ����ּ���

	 */
	

	public static void main(String[] args) {
		int[] numbers= {6,10,2};
		
		String answer = "";
        List<String> stringList = new ArrayList<>();

        for (int Int : numbers) {
            stringList.add(String.valueOf(Int));
        }
        System.out.print(stringList);
        stringList.sort(((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));
        System.out.print(stringList);
        for (String s : stringList) {
            answer += s;
        }
        

		answer=answer.charAt(0)=='0'?"0":answer;
		
		System.out.print(answer);
		
		
	}

}
