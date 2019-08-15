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
			if (index >= dates.size())index--;	// 범위 벗어나서 if문에서 체크 안하기 위해서 
		}

		if (stock == 0) {
			stock += q.top();
			q.pop(); 
			answer++; 	// 우선순위 큐라서 가장 큰 값 나옴 
		}

	stock--;
	}
	
	
	cout << answer;

}