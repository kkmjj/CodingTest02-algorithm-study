#include<iostream>
#include<queue>

using namespace std;



struct piza
{
	int x;
	int cnt;
};

queue<piza> q;

int topping[8] = { 2,1,3,1,2,4,4,3 };
int primary[4] = { 1,2,3,4 };
int cnt = 0;

int  bfs(int start,int index) // ������ǥ , primary ��ǥ
{
	piza s;
	s.x = start;
	s.cnt = 0;
	int ax[2] = { 1,-1 }; // ���� ������ 
	q.push(s);

	while (!q.empty())
	{
		piza temp = q.front();
		q.pop();
	
		if (topping[temp.x] == primary[index])
		{
			cnt += temp.cnt;

			while (!q.empty()) q.pop();

			return temp.x; // �� �ڸ����� ������ �ٽ� ���� 
		}

		for (int i = 0; i < 2; i++)
		{
			piza next;
			next.x = temp.x + ax[i];
			next.cnt = temp.cnt + 1;
	
			if (next.x < 0)next.x = 7;   // �� ���ʿ��� �� ���������� �̵� 
			if (next.x > 7)next.x = 0;  // �� ���ʿ��� �ǿ��������� �̵� 


			q.push(next);  // �ƹ� ���� ���� �������� �� �̵��غ��� 
			
			

		}



	}



}



int main() {

	int sum = 0;
	int index = 0;
	



	for (int j = 0; j < 4; j++)
	{
		
		index=bfs(index, j);
			
	
	}


	cout << cnt;



}