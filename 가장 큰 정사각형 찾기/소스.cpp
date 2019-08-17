#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;

vector<vector<int>> board = { {1} };

int check[1002][1002];
int answer = 0;



int main() 
{
	if (board.size() < 2 || board[0].size() < 2)
	{

		for (int j = 0; j < board.size(); j++)
		{
			for (int i = 0; i < board[0].size(); i++)
			{
				if (board[j][i] == 1) answer = 1;
			}
		}
	}
	else
	{

		for (int j = 1; j < board.size(); j++)
		{
			for (int i = 1; i < board[0].size(); i++)
			{
				if (board[j][i] == 1)
				{
					board[j][i] = min(board[j - 1][i - 1], min(board[j][i - 1], board[j - 1][i])) + 1;
					answer = max(board[j][i], answer);
				}
			}
		}
	}
	answer = pow(answer, 2);
	cout << answer;



}