package ���ȣ;

import java.util.Arrays;
import java.util.Scanner;

public class room {
	static String N;
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		N=input.next();
		// �Է�
		int ns=0;
		int v[]  =new int[10];
		for(int i=0;i<N.length();i++) {
			if(N.charAt(i)-'0'==6||N.charAt(i)-'0'==9) {
				ns++;
			}
		}
		// 6,9�� ���� 
		
		int set=1;
		v[N.charAt(0)-'0']=1;
		
		for(int i=1;i<N.length();i++)
		{
			if(N.charAt(i)-'0'!=6&&N.charAt(i)-'0'!=9&&v[N.charAt(i)-'0']!=0) 
			{//6 ,9�� �����ϰ� �ٸ� ��Ʈ�̸� 
				v[N.charAt(i)-'0']++;
			}
			else //�湮���� �ʾ����� 
			{
				v[N.charAt(i)-'0']=1;
			}
			
			
			
			
		}
		
		if(ns%2!=0) 
		{
			ns=ns/2+1;
		}
		else
		{
			ns=ns/2;
		}
		Arrays.parallelSort(v);
		//6,9�� ���� �� set�� ������ ū �� ���� 
		
		v[v.length-1]=v[v.length-1]<ns?ns:v[v.length-1];
		System.out.print(v[v.length-1]);
		
		
		
		
	}

}
