#include<iostream>
#include <vector>
#include<queue>

using namespace std;

struct type
{
	int r;
	int c;

};


type start;


int m = 2;
int n = 2;
vector<vector<int>> picture = { {1,1},{1,1} };
int number_of_area = 0;
int max_size_of_one_area = 0;
int max_temp;






int main() {

	vector<int> answer(2);


	for (int i = 0; i < m; i++)
	{
		for (int j = 0; j <n; j++)
		{
			if (picture[i][j] != 0)
			{
				number_of_area++;
				max_temp = 1;
				int cur = picture[i][j];

				picture[i][j] = 0;

				int ar[] = { 1,0,-1,0 };
				int ac[] = { 0,1,0,-1 };//상하 좌우 

				queue<type> q;
				start.r = i;
				start.c = j;
				q.push(start);

				while (!q.empty())
				{
					type temp;
					temp = q.front();

					q.pop();

					for (int i = 0; i < 4; i++)
					{
						int nextr = temp.r + ar[i];
						int nextc = temp.c + ac[i];

						if (nextr >= 0 && nextc >= 0 && nextr <m && nextc <n
							&& picture[nextr][nextc] == cur) //범위 안에 있으면 
						{
							type next;
							next.r = nextr;
							next.c = nextc;
							picture[next.r][next.c] = 0;
							q.push(next);
							max_temp++;




						}





					}


				}


				max_size_of_one_area = max_size_of_one_area < max_temp ? 
					max_temp : max_size_of_one_area;

			
				
			}
		}
	}





	answer[0] = number_of_area;
	answer[1] = max_size_of_one_area;

	cout << answer[0] << " " << answer[1];
}