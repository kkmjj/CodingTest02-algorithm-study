#include<iostream>
#include<vector>
#include<string>
using namespace std;



vector<vector<int>> baseball = { {123,1,1},{356,1,0},{327,2,0},{489,0,1} };

int check[10];
int temp[4];
int strike;
int ball;
int answer = 0;
bool visit = false;
string number = "";

void dfs(int cur, vector<vector<int>> baseball)
{
	if (cur == 3)
	{

		visit = false;
		for (int j = 0; j < baseball.size(); j++)
		{
			if (visit == true)break;
			number = to_string(baseball[j][0]);
			strike = 0;
			ball = 0;

			for (int i = 0; i < 3; i++)
			{
				//cout << temp[i] << " ";

				for (int k = 0; k < 3; k++)
				{
					if (temp[i] == number.at(k) - '0' && i == k)
					{
						strike++;
						continue;
					}

					if (temp[i] == number.at(k) - '0')
					{
						ball++;	// 위치가 다른데 같으면 ball

					}
				}

			}
			if (ball != baseball[j][2] || strike != baseball[j][1]) visit=true;
		}
		if (visit == false)answer++;
		


		
		return;
	}


	for (int i = 1; i <= 9; i++)
	{
		if (check[i] == 1)continue;
		temp[cur] = i;
		check[i] = 1;

		dfs(cur + 1,baseball);
		check[i] = 0;

	}


}

int main()
{

	

		
		dfs(0,baseball);

	
	
	cout << answer;






}