#include<iostream>
#include<stack>
using namespace std;


string s = "()()())";
int main()

{
	bool answer = true;

	stack <char> stack;

	for (int i = 0; i < s.size(); i++)
	{
		if (s.at(i) == '(')
		{
			stack.push(s.at(i));
		}
		else if (s.at(i) == ')')
		{
			if (stack.empty()) 
			{
				answer = false; 
				break;
			}
			stack.pop();

		}

	}

	if (!stack.empty())answer = false;


	cout << answer;


}