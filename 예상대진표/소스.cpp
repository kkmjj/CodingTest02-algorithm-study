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
		// ¦���� �׳� ���� 


		n = n / 2;// ��ü 8 -> 4;

		a = a / 2;
		b = b / 2;
		if (a == b)continue;
			answer++;


	}

	cout << answer;


}