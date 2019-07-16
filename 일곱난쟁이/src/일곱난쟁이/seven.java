package ÀÏ°ö³­ÀïÀÌ;

import java.util.Arrays;
import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int nine[] =new int[9];
		int sum=0;
		for(int i=0;i<9;i++) {
			nine[i]=input.nextInt();
			sum+=nine[i];
		}
		// ÀÔ·Â
		 
		sum=sum-100; // ÃÑÇÕ-100
		
		boolean v=false;
		for(int i=0;i<=7;i++) {
			
			for(int j=i+1;j<8;j++) {
			if(nine[i]+nine[j]==sum&&v==false) {
				nine[i]=0;
				nine[j]=0;
				v=true;
				
			}
		
			
			}
			
			
		}
		
		Arrays.parallelSort(nine);
		
		for(int i=2;i<9;i++) {
			System.out.println(nine[i]);
		}
		
		
		
		
	}

}
