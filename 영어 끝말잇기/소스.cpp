#include <string>
#include <vector>
#include <iostream>



using namespace std;

int n = 3;
vector<string> words = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
"establish", "hang", "gather", "refer", "reference", "estimate", "executive" };


int main() {

	vector<int> answer;
	
	int ans = 0;
	
	for (int i = 1; i <words.size(); i++)
	{
		// 끝과 처음이 같다.
		if (words[i - 1].at(words[i - 1].size() - 1) == words[i].at(0))
		{
			for (int j = 0; j <= i-1; j++)
			{
				if (words[j] == words[i])
				{
					ans = i;
					i = words.size() + 1;
					break;
				}
			}



		}
		else
		{
			ans = i;
			break;
		}

	}
	
	if (ans != 0)
	{
		answer.push_back(ans%n + 1);
		answer.push_back(ans / n + 1);
	}
	if (ans == 0)
	{
		answer.push_back(0);
		answer.push_back(0);
	}

	cout << answer.at(0) << answer.at(1);

}

	