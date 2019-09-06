
#include <vector>
#include<iostream>
#include<queue>
#include<algorithm>
using namespace std;

struct type
{
	int start;
	int cm;
	bool operator()(type a, type b)
	{
		return a.cm > b.cm;
	}
};


vector<vector<int>> jobs = { {1,3}, {5,10}};


int main() {

	sort(jobs.begin(), jobs.end());
	int answer = 0;
	

	priority_queue<type,vector<type>,type> q;
	

	int cur = jobs[0][0] + jobs[0][1];
	int sum = jobs[0][1];

	if (jobs.size() == 2){
		sum += jobs[1][1];
		}
	else {
		for (int i = 1; i < jobs.size(); i++)
		{
			if (jobs[i][0] <= cur) // 현재 일하는 범위 내에서 push 
			{
				type next;
				next.start = jobs[i][0];
				next.cm = jobs[i][1];
				q.push(next);
				continue;

			}

			if (q.empty()) {
				cur = jobs[i][0] + jobs[i][1];
				sum += jobs[i][1];
				continue;
			}

			// 일 범위 내에서 다 들어갔으면 pop을하나 해준다.
			sum += q.top().cm + cur - q.top().start;
			cur += q.top().cm;
			q.pop();
			i--;

		}

		while (!q.empty())
		{
			sum += q.top().cm + cur - q.top().start;
			cur += q.top().cm;
			q.pop();
		}

	}
	answer = sum / jobs.size();




	
	cout << answer;


}