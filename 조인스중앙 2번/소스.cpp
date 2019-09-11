#include<iostream>
#include<vector>
using namespace std;
vector<int> arr = { 2,5,3,8,1 };
int k = 3;
int t = 11;
int temp[16];
int sum = 0;
int answer = 0;

void dfs(vector<int> arr, int cur, int start)
{
	if (cur >arr.size())return;

	if (cur >=k)
	{
		sum = 0;
		for (int i = 0; i < cur; i++)
		{
			cout << temp[i] << " ";
			sum += temp[i];
		}

		if (sum <= 11) answer++;
		cout << endl;
		
	}


	for (int i = start; i < arr.size(); i++)
	{

		temp[cur] = arr[i];
		dfs(arr, cur + 1, i+1);
	}





}

int main() {

	
	dfs(arr, 0, 0);


	cout << answer;
}