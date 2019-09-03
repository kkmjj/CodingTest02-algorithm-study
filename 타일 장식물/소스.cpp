#include<iostream>
#include<vector>

using namespace std;


int main() {
	int N = 80;

	long long  dp[81];


	dp[1] = 1;
	dp[2] = 1;

	for (int i = 3; i <= N; i++)
	{
		dp[i] = dp[i - 1] + dp[i - 2];
	}

	long long answer = dp[N] * 2 + (dp[N - 1] + dp[N]) * 2;


	cout << answer;

}