#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;




vector<int> nums = { 3,3,3,2,2,2};




int main() 
{
	int answer = 1;

	sort(nums.begin(), nums.end());	// 숫자 정렬 

	int temp = nums[0];	// 맨처음 값 먼저 비교 

	for (int i = 1; i < nums.size(); i++)
	{
		if (temp == nums[i])continue;

		if (answer == nums.size() / 2) break;
		
		answer++;
		temp = nums[i];



	}


	cout << answer;


}