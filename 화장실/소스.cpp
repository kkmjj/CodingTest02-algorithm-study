#include<iostream>
#include<algorithm>

using namespace std;

int visit[150];

int main() {
	// Ǯ�� ���� : �ð��� �����߿��� ��ġ�� ������� �ִ밪�� ȭ��� ������ �ִ밪�� �ɰ� ���� .

	int N; // ���� ���� ��� �� 
	cin >> N;
	int front, end;
	int max = 0;
	int min = 10000000;

	for (int i = 0; i < N; i++)
	{
		cin >> front >> end;
		if (min > front)min = front;		// �ּ� �ð� ���ϱ� 
		if (max < end) max = end;			// �ִ� �ð��� ���ϱ� 

		for (int j = front; j < end; j++)	// �������� ���ĵ� ������� �����鼭 ���°� ������ �߰� ���ص���.
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