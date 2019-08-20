#include<iostream>
#include<vector>
#include<algorithm>
#include <functional>



using namespace std;


vector<int> A = { 1,4,2 };
vector<int> B = { 5,4,4 };

bool compare(int a,int b)
{
	return a < b;
}

int main() 
{


	int answer = 0;

	sort(A.begin(), A.end());
	sort(B.begin(), B.end(),greater<int>());

	for (int i = 0; i < A.size(); i++)
	{
		
		answer += (A.at(i)*B.at(i));
	
	}

	cout << answer;

}