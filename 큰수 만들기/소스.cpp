#include<iostream>
#include<string>
using namespace std;

int k =2;
string number = "1924";



int main() {
	int index =-1;
	string answer = "";
	int temp = number.length() - (number.length()-k); // 원하는 자리수 
	int idx=0;

	while (temp!=number.length())
	{
		int max = 0;
	
		for (int i = temp; i >index; i--)
		{
		

			if (max <= number.at(i) - '0')
			{
				max = number.at(i) - '0';
				idx = i;
			}

		}
		index = idx;
		temp++;
		answer += to_string(max);
		//cout <<idx <<  answer;
		//cout << endl;
	}






}