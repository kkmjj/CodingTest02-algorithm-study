package 방번호;

import java.util.Arrays;
import java.util.Scanner;

public class room {
	static String N;
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		N=input.next();
		// 입력
		int ns=0;
		int v[]  =new int[10];
		for(int i=0;i<N.length();i++) {
			if(N.charAt(i)-'0'==6||N.charAt(i)-'0'==9) {
				ns++;
			}
		}
		// 6,9의 개수 
		
		int set=1;
		v[N.charAt(0)-'0']=1;
		
		for(int i=1;i<N.length();i++)
		{
			if(N.charAt(i)-'0'!=6&&N.charAt(i)-'0'!=9&&v[N.charAt(i)-'0']!=0) 
			{//6 ,9를 제외하고 다른 세트이면 
				v[N.charAt(i)-'0']++;
			}
			else //방문하지 않았으면 
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
		//6,9의 개수 와 set의 개수중 큰 값 선택 
		
		v[v.length-1]=v[v.length-1]<ns?ns:v[v.length-1];
		System.out.print(v[v.length-1]);
		
		
		
		
	}

}
