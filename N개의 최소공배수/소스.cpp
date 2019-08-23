#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int gcd(int a, int b) {
	while (b != 0) {
		int r = a%b;
		a = b;
		b = r;
	}
	return a;
}



int main() 
{
	
	int answer = 0;
	vector<int> arr = { 16,18,30 };
	
	if (arr.size() == 1)return answer=arr[0];

	if (arr.size() == 2) return answer=arr[0] * arr[1] / gcd(arr[0], arr[1]);

		
	int temp = arr[0] * arr[1] / gcd(arr[0], arr[1]);


	for (int i = 2; i < arr.size(); i++)
	{
		answer = temp*arr[i] / gcd(temp, arr[i]);
		temp= temp*arr[i] / gcd(temp, arr[i]);
	}
	
	cout << answer;





}