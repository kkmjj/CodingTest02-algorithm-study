import java.util.*;
public class Coin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
        int s = in.nextInt();
        
        int[] coin = new int[n+1];
        int[] dp = new int[s+1];
        
        for(int i = 1 ; i <= n ; i++) {
            coin[i] = in.nextInt();
        }
        
        dp[0] = 1; //최초 시작점
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= s ; j++) {// j는 가치 coin[i]가 j보다 작을때 까지
           
                if(coin[i]<=j) {
                	dp[j] +=dp[j-coin[i]];
            }
           
        }
        
      
        
    }
        
        
        
        
        System.out.print(dp[s]);
        
        
}
}
		

	
	
	
	
