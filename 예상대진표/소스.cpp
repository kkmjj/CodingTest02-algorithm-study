#include<iostream>
using namespace std;

int n = 8;
int a = 1;
int b = 3;



int main()
{
	int answer = 1;
	




	while (a != b)
	{
		if (a % 2 != 0) a++;
		if (b % 2 != 0) b++;
		// 짝수로 그냥 만들어서 


		n = n / 2;// 전체 8 -> 4;

		a = a / 2;
		b = b / 2;
		if (a == b)continue;
			answer++;


	}

	cout << answer;


}