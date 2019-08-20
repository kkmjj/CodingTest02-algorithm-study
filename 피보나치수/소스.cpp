#include<iostream>
using namespace std;

int answer = 0;



int dp[100000];

int dynamic(int n)
{

	for (int i = 3; i <=n; i++)
	{
		dp[i] = dp[i - 1] + dp[i - 2];
	
	}

	return dp[n];

}


int main()
{
	int n = 5;



	dp[0] = 0;
	dp[1] = 1;
	dp[2] = 1;

	
	cout << dynamic(n) % 1234567;
	


}