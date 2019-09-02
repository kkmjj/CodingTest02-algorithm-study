#include<iostream>
#include<vector>
#include<queue>


using namespace std;

int n = 6;
vector<vector<int>> edge = { { 3, 6 },{ 4, 3 },{ 3, 2 },{ 1, 3 },{ 1, 2 },{ 2, 4 },{ 5, 2 } };
int visit[20001][20001];
int answer[20001];
int main()
{




	//visit[edge[0][0]][edge[0][1]=1;  


	for (int i = 0; i < edge.size(); i++)
	{
		visit[edge[i][0]][edge[i][1]] = 1;
		visit[edge[i][1]][edge[i][0]] = 1;
	}// 양방향 체크 

	queue<int> q;

	q.push(1); ///처음 1
	
	int max = 0;

	while (!q.empty())
	{
		int temp = q.front();
		q.pop();

		for (int i = 2; i <= n; i++)
		{
			if (answer[i] == 0 && visit[temp][i] == 1)
			{
				q.push(i);
				answer[i] = answer[temp]+1;
				max = answer[i] < max ? max : answer[i];
				cout << max;
				cout << endl;
			}



		}
		


	}
	cout << max;
	int ans = 0;

	for (int i = 1; i <= n; i++)
	{
		if (max == answer[i])ans++;
	}

	cout << ans;




}