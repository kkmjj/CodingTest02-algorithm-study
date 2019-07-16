import java.util.Scanner;

public class tal {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int x,y;
		x=input.nextInt();
		y=input.nextInt();
		
		int w=input.nextInt();
		int h=input.nextInt();
		
		int xresult=w-x;
		int yresult=h-y;
		
		int result=xresult<yresult?xresult:yresult;
		
		result=result<x?result:x;
		result=result<y?result:y;
		
		System.out.print(result);
		
		
		
	}
}
