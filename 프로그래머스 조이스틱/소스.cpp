#include<iostream>

using namespace std;

string name = "JAN"; // �Է�



int b[21];
int check[21];
int temp[21];
int cnt = 0;
bool visit = true;
int answer = 1000000;
int current_move(string name)
{
	int alpha_move = 0;
	for (int i = 0; i < name.length(); i++)  // ���ʿ��� ���������� �̵� 
	{
		if (name.at(i) == 'A')
		{

			continue;
		}

		if (name.at(i) - 65 <= 13) // 13�� N���� ������ ���� ���ĺ��� �ø��� 
		{
			alpha_move += name.at(i) - 65;

		}
		else// N���� ũ�� ������ ���ĺ��� �ø���.
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
			check[temp[i]] = 1; // ���� üũ 
			
		}

		for (int j = 0; j < cnt; j++)
		{
			if (check[b[j]] != 1) {
				visit = false; // �ϳ��� üũ �ȵ����� false;
				break;
			}
		}

		for (int i = 0; i <= depth; i++)
		{
			cout << temp[i];
			check[temp[i]] = 0; // ���� üũ 

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
		if (name.at(i) != 'A') // A�� �ƴ� �������ϱ� 
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