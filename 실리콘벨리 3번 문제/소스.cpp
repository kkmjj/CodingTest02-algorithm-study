#include<iostream>
#include <string>
#include <vector>

using namespace std;
vector<int> estimates = { 1,1,9,3,7,6,5,10 };
int k = 4;

int main() {
	int N = estimates.size(); // 8
	int answer = 0;

	for (int i = N - k; i >= 0; i--) // 4개중 앞에 숫자 
	{
		int max = 0;
		for (int j = i; j < i + k; j++)
		{
			max += estimates[j];
		}

		answer = answer < max ? max : answer;

	}


	cout << answer;


}