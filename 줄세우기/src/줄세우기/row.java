package �ټ����;

import java.util.*;
public class row {
	
	
	
	
public static void main(String arg[]) {
	Scanner input =new Scanner(System.in);
	int N=input.nextInt();
	int M=input.nextInt();
	int[] indegree = new int[N+1];
    ArrayList<Integer> list[] = new ArrayList[N+1];	// ������ ���� 
    for(int i=1; i<=N; i++){
        list[i] = new ArrayList<Integer>();
    }
    for(int i=0; i<M; i++){
        int x = input.nextInt();
        int y =	input.nextInt();
        list[x].add(y);
        indegree[y]++; // ȭ��ǥ ���� ���� 
    }
    // �Է� 
    
    
    //Topological Sorting
    Queue<Integer> q = new LinkedList<Integer>();
    //indegree�� 0�϶� ť�� �ִ´�. indegree�� �ڽ��� ����Ű�� �ִ� ȭ��ǥ�� ����
    for(int i=1; i<=N; i++){
        if(indegree[i]==0){
            q.offer(i);
        }
    }
    while(!q.isEmpty()){
        System.out.println((int)q.element());
        int current = q.poll();
        //�ڽ��� ����Ű�� �ִ� ��ǥ���� �湮�Ͽ� indegree���� -1 ���ְ� ���� 0�̶�� ť�� �־��ش�.
        for(int i=0; i<list[current].size(); i++){ // list[index].size -> �ش� ������ 
        	  System.out.println(i+" "+list[current].size());
            int next = list[current].get(i);
            indegree[next]--;
            if(indegree[next]==0){
                q.offer(next);
            }
        }
    }
    
}


}
