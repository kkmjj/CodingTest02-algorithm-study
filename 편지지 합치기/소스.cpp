#include<iostream>
using namespace std;
int N;

struct paper
{
	int r=0;
	int c=0;
}paper[5];
int answer = 100000;
int r[5];
int c[5];
int check[5];

void dfs(int cur)
{

	if (cur >=N)
	{
		int tempN = N;
		int tempr = r[0];
		int tempc = c[0];
		for (int i = 1; i < N; i++)
		{
			if (tempr <= r[i] && tempc <= c[i])
			{
				tempN--;
				tempr = r[i];
				tempc = c[i];
			}
			cout << r[i] << " "<< c[i];

		}
		answer = answer < tempN ? answer : tempN;
		cout << endl;
		return;

	}


	for (int i = 0; i <N; i++)
	{
		if (check[i])continue;
		r[cur] = paper[i].r;
		c[cur] = paper[i].c;
		check[i] = 1;
		dfs(cur + 1);
		check[i] = 0;


	}



}


int main()
{
	cin >> N;

	for (int i = 0; i <N; i++)
	{
		cin >> paper[i].r >> paper[i].c;
	}
	// ют╥б 4,4  3,3   1,1     1,3 




	dfs(0);

	cout << answer;


} 