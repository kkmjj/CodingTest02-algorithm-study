#include<string>
#include<vector>
#include<iostream>
#include<algorithm>
using namespace std;

string a = "";

bool pelindrom(string a)
{

	string temp = a;
	reverse(a.begin(),a.end());

	if (temp == a) return true;

	return false;
}

int main()
{
	
	cin >> a;
	// 입력 


	if (!pelindrom(a)) // 해당 문자가 펠린드롬이 아니면 
	{
		char temp = a.at(a.length() - 1); // 마지막 값을 비교 
		int index = a.length() - 2;

		while (temp == a.at(index))
		{
			index--;
		}


		string back = a.substr(0, index+1);

		a += back;


	}


	cout << a;


}