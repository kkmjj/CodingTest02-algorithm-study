import java.util.*;
/*
 124 ���� �ֽ��ϴ�. 124 ���󿡼��� 10������ �ƴ� ������ ���� �ڽŵ鸸�� ��Ģ���� ���� ǥ���մϴ�.
1.124 ���󿡴� �ڿ����� �����մϴ�.
2.124 ���󿡴� ��� ���� ǥ���� �� 1, 2, 4�� ����մϴ�.

���� �� 124 ���󿡼� ����ϴ� ���ڴ� ������ ���� ��ȯ�˴ϴ�.


10����

124 ����

10����

124 ����


1 1 6 14 
2 2 7 21 
3 4 8 22 
4 11 9 24 
5 12 10 41 

�ڿ��� n�� �Ű������� �־��� ��, n�� 124 ���󿡼� ����ϴ� ���ڷ� �ٲ� ���� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.

 */


public class Main {

	public static void main(String[] args) {
			int n=10;
			String answer="";
			int reminder;
			
			while(n>0)
			{
				reminder =n%3;
				n = n/3;
				
				if(reminder ==0)
				{
					n-=1;
					reminder =4;
				}
			
				answer=reminder+answer;
			}
			
			System.out.print(answer);

	}

}
