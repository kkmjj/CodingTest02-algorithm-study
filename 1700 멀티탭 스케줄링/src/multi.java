import java.util.*;
public class multi {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); // ������ ����
	        int m = sc.nextInt(); // ��ǰ ��
	        int[] arr = new int[m+1];
	        for(int i=1;i<=m;i++) {
	        	 arr[i] = sc.nextInt();
	        }
	           
	 
	        int result = 0;
	        HashSet<Integer> set = new HashSet<>();
	        for(int i=1;i<=m;i++){
	            int t = arr[i];
	            // �̹� �����ִ� �Ÿ� �״�� ��������
	            if(set.contains(t)) continue;
	           
	            
	            // ���� �žƾ��� ���
	            // 1) �ܼ�Ʈ�� �� �����ִٸ�
	            if(set.size()==n){
	                int idx = -3, target = 0;
	                for(int tt:set){
	                    int tIdx = 9999;
	                    // ���� �Ⱦ��̴� �� ã��.
	                    for(int j=i+1;j<m;j++){
	                        // �Ȱ����� �ִٸ� �ش� index ����
	                        if(tt==arr[j]){
	                            tIdx = j;
	                            break;
	                        }
	                    }
	                    // tIdx�� ������ �ʾҴٸ� �� �ڷ� ������ �ʴ´ٴ� ���̴�.
	                    if(tIdx==9999){
	                        target = tt;
	                        break;
	                    }else{
	                        // ���� ���߿� ���Ǵ°� ã��.
	                        if(tIdx>idx){
	                            idx = tIdx;
	                            target = arr[tIdx];
	                        }
	                    }
	                }
	                // �ܼ�Ʈ ���ֱ�
	                set.remove(target);
	                result++;
	            }
	          
	            
	            // 2) ���� ���� �ִٸ�
	            set.add(t);
	        }
	        System.out.println(result);
	    }


}
