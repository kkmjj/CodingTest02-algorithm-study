
#include<iostream>
#include<vector>
#include<string>
using namespace std;


string begn ="hit";
string target ="cog";
vector<string> words = { { "hot"},{ "dot"}, {"dog"}, {"lot"}, {"log"}, {"cog"} };
int cnt = 0;
bool visit[51];
string temp[51];


void dfs(vector<string>words, string beg, string target,int move)
{

	if (beg == target)
	{
		for (int i = 1; i <move; i++)
		{
			cout << temp[i] << endl;
		}
		cout << move;
		cout << endl;
		cnt = move;
		return;
	}
	if (move > words.size())return;
	




	for (int i = 0; i < words.size(); i++)
	{
		int dif = 0;
		if (visit[i])continue;
		for (int j = 0; j < words[0].size(); j++)
		{
			if (beg[j] != words[i][j])dif++;

			if (dif > 1)break;
		}

		if (dif == 1) {
			visit[i] = true;
			
			temp[move] = beg;
			dfs(words, words[i], target,move+1);
			visit[i] = false;
		}

	}






}



int main() 
{
	bool same = false;

	for (int i = 0; i < words.size(); i++)
	{
		if (target == words[i])
		{
			same = true;
			break;
		}

	}
	// target이 포함 되어 있는지 확인 

	int answer = 0;

	if (same)
	{
		dfs(words, begn, target,0);
		answer = cnt;
	}

	cout << answer;
}