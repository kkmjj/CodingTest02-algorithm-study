#include<iostream>
using namespace std;



int n=15;

int main()
{
	int answer = 0;
	int temp = 0;
	int start = 1;

	while (start != n+1)
	{
		temp = 0;
		for (int i = start; i <= n; i++)
		{


			temp += i;
			if (temp == n)
			{
				cout << start;
				cout << endl;
				answer++;
				break;
			}

			if (temp > n)break;



		}
		start++;
	}

	cout << answer;


}