#include<iostream>
#include<vector>


using namespace std;

int n = 3;
vector<vector<int>> computers = { {1,1,0},{1,1,0},{0,0,1} };
int visit[201];



void dfs(vector<vector<int>> computers, int n, int cur)
{



	for (int i = 0; i < n; i++)
	{
		if (i == cur)continue;

		if (computers[cur][i] == 1 && visit[i]==0)
		{
			visit[i] = 1;
			dfs(computers, n, i);
		}
	}

}


int main()
{




	int answer = 0;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{

			if (computers[i][j] == 1&& visit[j]==0)
			{
				visit[i] = 1;
				visit[j]= 1;
				dfs(computers, n, j);
				answer++;
			}


		}
	}


	cout << answer;





}