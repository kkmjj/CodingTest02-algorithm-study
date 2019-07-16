package ���ĺ�1987;

import java.util.Scanner;

public class answer {
	static int map[][];
	static int M;
	static int N;
	static boolean visit[];
	static int max=0;
	static int cnt=0;
	public static void dfs(int a, int b){
		int dx[]={1,-1,0,0};
		int dy[]={0,0,1,-1};
		cnt++;
       max=max<cnt?cnt:max;
        //�湮�� ���ĺ� üũ 
        visit[map[a][b]]=true;
        
        for(int i = 0 ; i < 4 ; i++){
        	int  ax = a+dx[i];
            int  ay = b+dy[i];
            if(ax>=0&&ay>=0&&ax<M&&ay<N){
                if(!visit[map[ax][ay]]){
                    dfs(ax,ay);
                    //Ž�� �������� ī��Ʈ����/���ĺ�üũ����
                    cnt--;
                    visit[map[a][b]]=false;
                }
            }
        }
        
      
    }

	public static void main(String[] args) {	
		Scanner input =new Scanner(System.in);
		 M=input.nextInt();
		 N=input.nextInt();
		 map=new int[M][N];
		 visit=new boolean[26];
		 
		 for(int i=0;i<M;i++) {
			 String s =input.next();
			 for(int j=0;j<N;j++) {
				 map[i][j]=s.charAt(j)-'A';
			 }
		 }
		 // �Է� 
		 
		 
		 
		 dfs(0,0);
		 
		 System.out.print(max);
		 
		 

	}


}
