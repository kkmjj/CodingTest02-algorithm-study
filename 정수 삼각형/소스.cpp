#include<iostream>
#include <string>
#include <vector>

using namespace std;

vector<vector<int>> triangle = { {7},{3, 8},{8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };




vector<vector<int>> dp;

int main() {

	int answer = 0;

	int n = triangle.size();
	
	triangle[1][0] += triangle[0][0];
	triangle[1][1] += triangle[0][0];



	for (int i = 2; i < n; i++)	// row
	{

		for (int j = 0; j <= i; j++)

		{
			if (j == 0) {
				triangle[i][j] += triangle[i - 1][j];
				continue;
			}
			if (j == i) {
				triangle[i][j] += triangle[i - 1][j - 1];
				continue;
			}
			// ¾ç ÂÊ ³¡ 
			int temp = triangle[i - 1][j - 1] < triangle[i - 1][j] ? triangle[i - 1][j] : triangle[i - 1][j - 1];


			triangle[i][j] += temp;

		}


	}


	for (int i : triangle[n - 1])
	{
		
		answer = answer < i ? i : answer;
	}

	cout << answer;



	
}