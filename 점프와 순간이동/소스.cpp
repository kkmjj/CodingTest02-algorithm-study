#include<iostream>

using namespace std;

int n = 6;


int main()
{
	int answer = 0;



	while (n != 1)
	{


		if (n % 2 != 0) { // Ȧ���̸� 1ĭ �̵� 
			answer++;
			n--;

		}
		n = n / 2; 
	}

	answer++;
	cout << answer;






}