#include<iostream>
#include<vector>
#include<string>
using namespace std;
// num�� �־����� num���� ũ�ų� ���� ���߿��� �տ� �߸����� �ڿ� �ڸ��� ���� ���� ��� ���� ���� �ּҰ� 
/*
	21 -> 22 
	3462 -> 3462
*/

bool submul(string temp)
{
	int front = 1;
	int end = 1;
	for (int i = 0; i<temp.length()/2; i++)
	{

		front *= temp.at(i) - '0';

	}

	for (int i = temp.length()/2; i < temp.length(); i++)
	{
		end *= temp.at(i)-'0';
	}

	if (front == end) return false;

	return true;

}



int main() {

	int a = 3463;
	string temp = to_string(a);

	while (submul(temp))
	{

		a++;
		temp = to_string(a);
		
	}


	cout << a;




}