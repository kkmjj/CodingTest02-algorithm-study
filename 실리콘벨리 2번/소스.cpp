#include<iostream>
#include <string>
#include <vector>

using namespace std;

vector<vector<int>>office = { {1,0,0,0},{0,0,0,1},{0,0,1,0},{0,1,1,0} };
int k = 2;


int bfs(int r, int c)
{
	int count = 0;

	for (int l = r; l < r + k; l++)
	{
		for (int m = c; m < c + k; m++)
		{
			if (office[l][m] == 1)count++;
		}



	}

	return count;






}




int main() {

	int N = office.size();
	int answer = 0;
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			if (i <= N - k && j <= N - k) 
			{
				answer = answer < bfs(i, j) ? bfs(i, j) : answer;

			}
		}

	}

	cout << answer;




}
