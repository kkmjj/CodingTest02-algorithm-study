#include<iostream>
#include<algorithm>

using namespace std;

int visit[150];

int main() {
	// 풀이 생각 : 시간의 범위중에서 겹치는 사람수의 최대값이 화장실 개수의 최대값이 될것 같다 .

	int N; // 시험 보는 사람 수 
	cin >> N;
	int front, end;
	int max = 0;
	int min = 10000000;

	for (int i = 0; i < N; i++)
	{
		cin >> front >> end;
		if (min > front)min = front;		// 최소 시간 구하기 
		if (max < end) max = end;			// 최대 시간을 구하기 

		for (int j = front; j < end; j++)	// 나갈떄는 겹쳐도 상관없이 나가면서 들어가는건 개수를 추가 안해도됨.
		{
			visit[j]++;
		}
	}

	int answer = 0;

	for (int i = min; i < max; i++)
	{
		if (visit[i] > answer)answer = visit[i];
	}

	cout << answer;



}