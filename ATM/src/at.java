import java.util.Arrays;
import java.util.Scanner;
public class at {


	

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int atm[]=new int[n]; // �ڹٿ����� �迭ũ�� �ȿ� ���� ����
		for(int i=0;i<n;i++) {
			atm[i]=input.nextInt();
		}
		// �Է�
	Arrays.sort(atm);// Arrays�� ����ִ� ���̺귯�� 
		int temp=atm[0];
		for(int i=1;i<atm.length;i++) {
			atm[i]=atm[i]+atm[i-1];// �׸��� �˰��� �� �ڿ� ������� ���� 
			temp+=atm[i];
			System.out.println(temp);
			
		}
		
	System.out.println(temp);
	
		
		

	}

}
