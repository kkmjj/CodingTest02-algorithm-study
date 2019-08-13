#include<iostream>

using namespace std;

string name = "JAN"; // 입력



int b[21];
int check[21];
int temp[21];
int cnt = 0;
bool visit = true;
int answer = 1000000;
int current_move(string name)
{
	int alpha_move = 0;
	for (int i = 0; i < name.length(); i++)  // 왼쪽에서 오른쪽으로 이동 
	{
		if (name.at(i) == 'A')
		{

			continue;
		}

		if (name.at(i) - 65 <= 13) // 13인 N보다 작으면 위로 알파벳을 올리고 
		{
			alpha_move += name.at(i) - 65;

		}
		else// N보다 크면 밑으로 알파벳을 올린다.
		{
			alpha_move += (26 - (name.at(i) - 65));

		}
	}

	return alpha_move;
}


void dfs(int cur,int depth,string name)
{
	
	if (answer <= depth)return;

	if (depth <=name.length()-1)
	{
		visit = true;
	

	//	cout << depth<<"depth";
		cout << endl;
		for (int i = 0; i <= depth; i++)
		{	
		//	cout << temp[i];
			check[temp[i]] = 1; // 간곳 체크 
			
		}

		for (int j = 0; j < cnt; j++)
		{
			if (check[b[j]] != 1) {
				visit = false; // 하나라도 체크 안됐으면 false;
				break;
			}
		}

		for (int i = 0; i <= depth; i++)
		{
			cout << temp[i];
			check[temp[i]] = 0; // 간곳 체크 

		}


		if (visit) answer = answer < depth ? answer : depth;
		cout << endl;

		
	}

	if (depth == name.length() - 1)
	{
		return;
	}



	int right = cur + 1;
	if (right > name.length() - 1)right = 0;
	int left = cur - 1;
	if (left < 0)left = name.length() - 1;
	

	temp[depth] = right;
	dfs(right,depth+1,name);
	temp[depth] = left;
	dfs(left,depth+1,name);
	temp[depth] = 0;



}







int main()
{

	for (int i = 0; i < name.length(); i++)
	{
		if (name.at(i) != 'A') // A가 아닌 개수구하기 
		{
			b[cnt] = i;
			cnt++;
		}
	}



	dfs(0, 0,name);
	//cout << answer;
	//cout << current_move(name);
	answer = answer + current_move(name);
	
	cout << answer;













	
}