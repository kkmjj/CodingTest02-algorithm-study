#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;
int n = 11;



string dp[2] = { "4","13" };
int cnt = 0;

vector<int> answer;

void dfs(string a,int length)
{
	if (a.length() > length)  return;

	if (a.length() == length)
	{
		answer.push_back(atoi(a.c_str()));
		return;
	}



	dfs(a + "4",length);
	dfs(a + "13",length);




}

int main() {

	int l =1;
	while (answer.size() < n)
	{
		
		dfs("", l);
		l++;
	}
	sort(answer.begin(), answer.end());

	cout << answer[n-1];



}