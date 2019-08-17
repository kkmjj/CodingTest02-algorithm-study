#include<iostream>
using namespace std;

int n = 15;
int cnt = 1;
int binary(int n)
{
	cnt = 1;
	if (n == 1)return cnt;
	
	while (n!=1)
	{
		if (n % 2 == 1)cnt++;

		n = n / 2;

		
	}

	return cnt;

}


int main() 
{
	int n_count= 0;
	int answer = n;
	n_count =binary(n);

	
	int count = 1;
	while (n_count != count)
	{
		answer++;
		count= binary(answer);
		
	}

	cout << answer;
	
}