#include<iostream>
#include<queue>

using namespace std;



struct piza
{
	int x;
	int cnt;
	int target;
};

queue<piza> q;
/*
2,1,3,1,2,4,4,3
1,2,3,4

2,1,3,1,2,3,4,1
1,4,3,2
*/

int topping[8] = { 2,1,3,1,2,3,4,1 };
int primary[4] = { 1,4,3,2 };
int cnt = 0;
int visit[4];

int  bfs(int start) // 시작좌표 
{
	piza s;
	s.x = start;
	s.cnt = 0;
	s.target = 0; // 처음 우선순위 인덱스 

	int ax[2] = { 1,-1 }; // 왼쪽 오른쪽 
	q.push(s);
	
	while (!q.empty())
	{
		piza temp = q.front();
		q.pop();
		//cout << topping[temp.x] << " [" << temp.x << " ]" << temp.target;
		//cout << endl;
		if (temp.target==4 && topping[temp.x] == primary[3]) // 마지막 우선순위에 오게 되면 
		{
			
			cnt += temp.cnt;
			while (!q.empty())q.pop();
			return cnt; // 그 자리부터 다음에 다시 시작 
		}

		for (int i = 0; i < 2; i++)
		{
			piza next;
			next.x = temp.x + ax[i];
			next.cnt = temp.cnt + 1;
			next.target = temp.target;
			if (next.x < 0)next.x = 7;   // 맨 왼쪽에서 맨 오른쪽으로 이동 
			if (next.x > 7)next.x = 0;  // 맨 왼쪽에서 맨오늘쪽으로 이동 


			if (topping[next.x] == primary[temp.target]) // 해당 타겟에 오면 
			{
				next.target += 1;
			}

				q.push(next);  // 아무 조건 없이 양쪽으로 다 이동해보기 

			

		}



	}



}



int main() {

	int sum = 0;
	int index = 0;
	int temp= 0;


	
	cout << bfs(0);



}