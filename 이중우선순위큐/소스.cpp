#include<iostream>
#include<vector>
#include<queue>
#include<string>
using namespace std;



int main() {

	vector<string> operations = { "I 16","I -5643", "D 1","D 1","I 123","D -1" };
	vector<int> answer;
	priority_queue<int>q;



	for (int i = 0; i < operations.size(); i++)
	{
		if (operations[i][0] == 'I')// IÀÌ¸é PUSH
		{
			string t = operations[i].substr(2, operations[i].size() - 1);
			int temp = atoi(t.c_str());
			q.push(temp);
		}
		else if (operations[i] == "D 1" && !q.empty())q.pop();

		else if (operations[i] == "D -1" && !q.empty())
		{
			priority_queue<int> q_temp;
			int L = q.size();
			for (int j = 0; j < L- 1; j++)
			{
				q_temp.push(q.top());
				q.pop();
			}
			q = q_temp;
		}
	

	}

	if (q.empty())
	{
		answer.push_back(0);
		answer.push_back(0);
	}
	else
	{
		int L = q.size();
		answer.push_back(q.top());
		for (int j = 0; j < L - 1; j++)
		{
			
			q.pop();
		}
		answer.push_back(q.top());
	}


	for (int i = 0; i < 2; i++)
	{
		cout << answer[i];
	}




}