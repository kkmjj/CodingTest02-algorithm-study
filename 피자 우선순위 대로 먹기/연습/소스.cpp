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

int  bfs(int start) // ������ǥ 
{
	piza s;
	s.x = start;
	s.cnt = 0;
	s.target = 0; // ó�� �켱���� �ε��� 

	int ax[2] = { 1,-1 }; // ���� ������ 
	q.push(s);
	
	while (!q.empty())
	{
		piza temp = q.front();
		q.pop();
		//cout << topping[temp.x] << " [" << temp.x << " ]" << temp.target;
		//cout << endl;
		if (temp.target==4 && topping[temp.x] == primary[3]) // ������ �켱������ ���� �Ǹ� 
		{
			
			cnt += temp.cnt;
			while (!q.empty())q.pop();
			return cnt; // �� �ڸ����� ������ �ٽ� ���� 
		}

		for (int i = 0; i < 2; i++)
		{
			piza next;
			next.x = temp.x + ax[i];
			next.cnt = temp.cnt + 1;
			next.target = temp.target;
			if (next.x < 0)next.x = 7;   // �� ���ʿ��� �� ���������� �̵� 
			if (next.x > 7)next.x = 0;  // �� ���ʿ��� �ǿ��������� �̵� 


			if (topping[next.x] == primary[temp.target]) // �ش� Ÿ�ٿ� ���� 
			{
				next.target += 1;
			}

				q.push(next);  // �ƹ� ���� ���� �������� �� �̵��غ��� 

			

		}



	}



}



int main() {

	int sum = 0;
	int index = 0;
	int temp= 0;


	
	cout << bfs(0);



}