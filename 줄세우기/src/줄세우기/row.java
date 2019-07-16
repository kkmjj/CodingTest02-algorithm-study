package 줄세우기;

import java.util.*;
public class row {
	
	
	
	
public static void main(String arg[]) {
	Scanner input =new Scanner(System.in);
	int N=input.nextInt();
	int M=input.nextInt();
	int[] indegree = new int[N+1];
    ArrayList<Integer> list[] = new ArrayList[N+1];	// 간선의 개수 
    for(int i=1; i<=N; i++){
        list[i] = new ArrayList<Integer>();
    }
    for(int i=0; i<M; i++){
        int x = input.nextInt();
        int y =	input.nextInt();
        list[x].add(y);
        indegree[y]++; // 화살표 받은 개수 
    }
    // 입력 
    
    
    //Topological Sorting
    Queue<Integer> q = new LinkedList<Integer>();
    //indegree가 0일때 큐에 넣는다. indegree는 자신을 가르키고 있는 화살표의 개수
    for(int i=1; i<=N; i++){
        if(indegree[i]==0){
            q.offer(i);
        }
    }
    while(!q.isEmpty()){
        System.out.println((int)q.element());
        int current = q.poll();
        //자신이 가르키고 있는 좌표들을 방문하여 indegree값을 -1 해주고 만약 0이라면 큐에 넣어준다.
        for(int i=0; i<list[current].size(); i++){ // list[index].size -> 해당 간선수 
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
