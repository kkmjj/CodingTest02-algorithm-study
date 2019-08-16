#include<iostream>
#include<vector>
using namespace std;

vector<int> numbers = { 1,1,1,1,1 };
int target = 3;
int temp[21];
int answer = 0;
int cnt = 0;
void dfs(int cur,int m,vector<int> numbers, int target)
{

	if (cur == numbers.size())
	{
		answer = 0;
		for (int i = 0; i < cur; i++)
		{
		//	cout << temp[i] * numbers[i];
			answer += (temp[i] * numbers[i]);
		}
	//	cout << " " << answer;
		if (answer == target)cnt++;
		//cout << endl;

		return;
	}

	int ax[] = { 1,-1 };

	for (int i = 0; i < 2; i++)
	{

		temp[cur] = ax[i];
		dfs(cur+1, m*ax[i],numbers,target);

	}


}



int main() {


	dfs(0,1,numbers,target);
	//cout << cnt;




}