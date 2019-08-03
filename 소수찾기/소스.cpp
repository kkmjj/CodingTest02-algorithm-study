#include<iostream>
#include<math.h>
#include<algorithm>

using namespace std;
int N;

int a[8]; // 7이하인 문자 
int temp[8];
int check[8];
int cnt = 0;
int visit[1000000];
int number = 0;
bool prime(int number)
{
	if (number == 1 ||number==0)return false;

	for (int i = 2; i <=(int)sqrt(number); i++)
	{

		if (number % i == 0)
		{
			return false;
			
		}
	}


	return true;
}



void dfs(int cur)
{
	if (cur < N) // cur=1 cur=2 
	{
		if (cur == 1 && prime(temp[0]) && visit[temp[0]]!=1) {
			visit[temp[0]] = 1;
			cnt++;
		}
		else
		{
			int ten = cur;
			int number = 0;
			for (int i = 0; i < cur; i++)
			{
				if (temp[i] != 0) number += temp[i] * pow(10, ten-1);
				ten--;
				
			}
		
			if (prime(number) && visit[number] != 1)
			{
				visit[number] = 1;
				cnt++;
			}

			
		}
	}

	if (cur >= N) // 123 기준 N=3
	{
		int ten = cur;
		int number = 0;
		
		for (int i = 0; i < cur; i++)
		{
			
			if(temp[i]!=0)number += temp[i] * pow(10, ten-1);
			ten--;
			
			
		
		}
		
		if (prime(number) && visit[number] != 1) {
			visit[number] = 1;
			cnt++;
		}
		
		return;
	}


	for (int i = 0; i < N; i++)
	{
		if (check[i] == 1)continue;

		check[i] = 1;
		temp[cur] = a[i];
		dfs(cur + 1);
		check[i] = 0;

	

	}



}


int main() {

	string numbers = "011";
	
	N = numbers.length();
	sort(numbers.begin(), numbers.end()); // 0이 있기 때문에 소트 시킨다.
	int answer = atoi(numbers.c_str()); // 문자를 int로 변환 
	
	
	for(int i = 0; i < N; i++)
	{
		a[i] = answer % 10;
		answer /= 10;

	}
	// 배열에 각각의 숫자를 넣어 두고 


	
	
		dfs(0);

		cout << cnt;
}