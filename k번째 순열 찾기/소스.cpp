#include<iostream>
#include<algorithm>
#include<string>
#include<sstream>
using namespace std;

int number[10];
int index;
int tmp[10];
int check[10];
int cnt=0;
int b; // �ش� ��ġ 

void dfs(int cur)
{
	if (cur==index)
	{
		cnt++;
		if (cnt == b)
		{
			for (int i = 0; i < cur; i++)
			{

				cout << tmp[i];
			}
			cout << endl;
		}
		return;
	}


	for (int i = 0; i < index; i++)
	{

		if (check[i] == 1)continue;


		tmp[cur] = number[i];
		check[i] = 1;
		dfs(cur + 1);
		check[i] = 0;
	}




}



int main() {
	string a; // ���� 

	getline(cin,a); // ���� �Է� 
	cin >> b;

	stringstream split_stream(a);
	string temp;
	


	while (split_stream >> temp) // temp�� �ֱ� 
	{
		//cout << temp;
		number[index]= atoi(temp.c_str());
		index++;
	}
	// int ���� ����� 

	sort(number, number + index); // �̸� ���Ҹ� sort ��Ű�� dfs ����� �ڵ����� ���� ������ ���� 


	dfs(0);



}