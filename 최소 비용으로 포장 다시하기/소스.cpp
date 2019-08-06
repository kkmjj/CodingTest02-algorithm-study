#include<iostream>
#include<queue>
#include<functional>
#include<vector>
using namespace std;
priority_queue<int, vector<int>, greater<int>> q;
int N;

int main() {
	cin >> N;
	int answer = 0;
	int sum;
	for (int i = 0; i < N; i++)
	{
		int data;
		cin >> data;
		q.push(data);
	}

	for (int i = 0; i < N-1; i++)
	{
		int first, second; // 두개씩 포장 
		first = q.top();
		q.pop();
		second = q.top();
		q.pop();
		sum = first + second;
		answer += sum;
		q.push(sum);
	}

	cout << answer;







}