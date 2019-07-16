import java.util.*;

public class oneclass {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // ют╥б 
        
        
        
        long[] num = new long[21];
        for(int i=0; i<n-2; i++) {
            if(i==0) {
                num[arr[i]] = 1;
            }
            num = calSum(arr, num, i+1);
        }
        
        System.out.println(num[arr[n-1]]);
        
        sc.close();
    }
 
    private static long[] calSum(int[] arr, long[] tmp, int x) {
        
        long[] num  = new long[21];
        for(int i=0; i<21; i++) {
            if(tmp[i] == 0) continue;
            else {
                if(i-arr[x] >= 0 && i-arr[x] <= 20) {
                    num[i-arr[x]] += tmp[i];
                }
                if(i+arr[x] >= 0 && i+arr[x] <= 20) {
                    num[i+arr[x]] += tmp[i];
                }
            }
        }
        return num;
        
    }

}
