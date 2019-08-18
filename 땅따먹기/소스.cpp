#include<iostream>
#include <vector>
#include<algorithm>
using namespace std;


vector<vector<int> > land = { {1,2,3,5},{5,6,7,8},{4,3,2,1} };

int dp[100000][4];

int main() 
{
	int answer = 0;

	for (int i = 0; i < 4; i++)
	{
		dp[0][i] = land[0][i];
	}

	for (int i = 1; i < land.size(); i++)
	{
		dp[i][0] = land[i][0] + max(dp[i - 1][1], max(dp[i - 1][2], dp[i - 1][3]));
		dp[i][1] = land[i][1] + max(dp[i - 1][0], max(dp[i - 1][2], dp[i - 1][3]));
		dp[i][2] = land[i][2] + max(dp[i - 1][0], max(dp[i - 1][1], dp[i - 1][3]));
		dp[i][3] = land[i][3] + max(dp[i - 1][0], max(dp[i - 1][2], dp[i - 1][1]));
	}

	for (int i = 0; i < 4; i++)
	{
		if (answer < dp[land.size() - 1][i])answer = dp[land.size() - 1][i];
	}
	
	cout << answer;
	

}