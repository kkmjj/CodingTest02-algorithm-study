#include<iostream>
#include<algorithm>

using namespace std;


int number[20000];
bool visit;



int main() {
	
	int N;

	string a; // 원소 
	cin >> N;
	int cnt = 0;
	int answer = 0;
	for (int i = 0; i < N; i++)
	{
		
		cin >> number[i];
		if (number[i] == 1) {
			visit = false;
			if (answer < cnt) answer = cnt;
			cnt = 0;
		}
		if (number[i] == 0)visit = true;

		if (visit && number[i] == 0) 
		{
			visit = true;
			cnt++;
		}
	}
	// number 배열에 저장 

	

	cout << (answer / 2 + 1);


}