#include<iostream>
#include<vector>
#include<math.h>
using namespace std;

int brown = 24;
int red = 24;
vector<int> answer;

int main() 
{
	int cnt = brown + red;
	if (red == 1)answer = { 3,3 };
	if (red == 2)answer = { 4,3 };
	
	if (red != 1 && red != 2)
	{
		for (int i = 3; i <= (int)sqrt(cnt); i++) // 3~루트-전체개수
		{
			if (cnt%i == 0)
			{
				if ((i - 2)*(cnt / i - 2) == red) // red 값이랑 같으면 
				{
					answer.push_back(cnt/i);
					answer.push_back(i);
				}
			}



		}
	}

	cout << answer[0] <<" "<< answer[1];


}