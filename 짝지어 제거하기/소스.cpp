#include<iostream>
#include<string>
#include<stack>


using namespace std;


int main() {

	string s = "baabaaabba";
	int answer = 1;
	stack<char> st;

	st.push(s[0]);

	for (int i = 1; i < s.size(); i++)
	{
		if (st.empty()) {
			st.push(s[i]);
			continue;
		}

		if (st.top() == s[i]) {
			st.pop();
			continue;
		}

		
		if (st.top() != s[i]) st.push(s[i]);
			

		

	}
	
	if (!st.empty()) answer = 0;

	cout << answer;




}