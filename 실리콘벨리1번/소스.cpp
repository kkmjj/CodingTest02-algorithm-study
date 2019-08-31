#include<iostream>
#include <string>
#include <vector>

using namespace std;

string phrases = "happy-birthday";
int second = 3;
string answer = "______________";

int main() {
	
	if (second < 14)
	{
		answer.erase(0,second);
		answer.append(phrases, 0, second);
	}


	else if (second % 14 == 0)
	{
		if ((second / 14) % 2 == 0) answer = "______________";
		else answer = "happy-birthday";
	}

	else if ((second / 14) % 2 != 0) // ¸òÀÌ È¦¼ö ÀÌ¸é 
	{

		answer = phrases;
		answer.erase(0, second % 14);
		answer.append(second % 14, '_');

	}

	else if ((second / 14) % 2 == 0)
	{
		answer = "______________";
		answer.erase(14 - second % 14, second % 14);
		answer.append(phrases, 0, second % 14);
	}




	cout << answer;








}