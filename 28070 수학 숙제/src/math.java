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
		// �Է� 
	
		
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length(); i++) {
				if (a[j].charAt(i) >= 48 && a[j].charAt(i) <= 57) {//���ڸ� �߰����� �� ����
					int start = i;
					int end ;
					while(true) {
						if(i==a[j].length()-1) {//������ �ε����� ���
							end = i+1;
							break;
						}else {//������ �ε����� �ƴѰ��
							i++;
							if(a[j].charAt(i) >= 48 && a[j].charAt(i) <= 57)//����
								continue;
							else {//����
								end = i;
								break;
							}
						}
					}
					list.add(new BigInteger(a[j].substring(start,end))); // ����Ʈ �� ���� �ȿ��ִ� string �ֱ�
				}
			}
		}
	
		Collections.sort(list);//����Ʈ ���� 
		for (BigInteger b : list) {	//����Ʈ for�� ������ 
			System.out.println(b);	
		}

		
		

	}

}
