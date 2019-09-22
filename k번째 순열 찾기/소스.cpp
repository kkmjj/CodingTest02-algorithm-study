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
int b; // 해당 위치 

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
	string a; // 원소 

	getline(cin,a); // 공백 입력 
	cin >> b;

	stringstream split_stream(a);
	string temp;
	


	while (split_stream >> temp) // temp에 넣기 
	{
		//cout << temp;
		number[index]= atoi(temp.c_str());
		index++;
	}
	// int 종류 만들기 

	sort(number, number + index); // 미리 원소를 sort 시키면 dfs 결과가 자동으로 작은 값부터 정렬 


	dfs(0);



}