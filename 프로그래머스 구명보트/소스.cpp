#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<int> people = { 40,40,40 };
int limit = 40;


int main() {
	int answer = 0;
	//ют╥б
	sort(people.begin(), people.end());

	int end = people.size() - 1;
	int front = 0;

	while (end > front)
	{
		if (people[end] + people[front] <= limit)
		{
			front++;
			end--;
			answer++;
		}
		else {
			end--;
			answer++;
		}


		if (front == end) {
			answer++;
			break;
		}
	}




	cout << answer;
}