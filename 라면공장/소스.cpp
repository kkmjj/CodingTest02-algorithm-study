#include<iostream>
#include<vector>
#include<queue>
using namespace std;

priority_queue<int, vector<int>>q;
vector<int> dates = {4,10,15};
vector<int> supplies = {20,5,10};
int k=30;
int stock=4;
int answer = 0;


int solution(int stock, vector<int> dates, vector<int> supplies, int k) {
	
	return answer;
}



int main() 
{
	int index = 0;



	for (int i = 0; i < k; i++)
	{
		if (i == dates[index])
		{
			q.push(supplies[index]);
			index++;
			if (index >= dates.size())index--;	// ���� ����� if������ üũ ���ϱ� ���ؼ� 
		}

		if (stock == 0) {
			stock += q.top();
			q.pop(); 
			answer++; 	// �켱���� ť�� ���� ū �� ���� 
		}

	stock--;
	}
	
	
	cout << answer;

}