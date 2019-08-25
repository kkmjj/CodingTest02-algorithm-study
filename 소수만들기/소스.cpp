#include <vector>
#include <iostream>
#include<math.h>
using namespace std;

vector<int> nums = { 1,2,7,6,4};


int temp[51];
int answer = 0;


bool prime(int a)
{
	
	for (int i = 2; i <=sqrt(a); i++)
	{
		if (a%i == 0)return false;
	}


	return true;
}



void dfs(int cur, vector<int> nums,int start)
{
	if (cur == 3)
	{
		int sum = 0;
		for (int i = 0; i < 3; i++)
		{
			cout << temp[i];
			sum += temp[i];
		}
		cout << "sum " << sum;
		if (prime(sum))answer++;
	
		cout << endl;
		return;
	}



	for (int i = start; i < nums.size(); i++)
	{
		
		
		temp[cur] = nums[i];
		dfs(cur + 1,nums,i+1);
		
	}


}




int main() {

	dfs(0,nums,0);
	

	
	cout << answer;

	

}