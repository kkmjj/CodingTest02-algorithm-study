#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;




vector<int> nums = { 3,3,3,2,2,2};




int main() 
{
	int answer = 1;

	sort(nums.begin(), nums.end());	// ���� ���� 

	int temp = nums[0];	// ��ó�� �� ���� �� 

	for (int i = 1; i < nums.size(); i++)
	{
		if (temp == nums[i])continue;

		if (answer == nums.size() / 2) break;
		
		answer++;
		temp = nums[i];



	}


	cout << answer;


}