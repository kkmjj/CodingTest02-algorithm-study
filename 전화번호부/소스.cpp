#include<iostream>
#include<algorithm>
#include<string>
#include<vector>
using namespace std;


vector<string> phone_book = {"119","97674223","1195524421"};


string hashtable[20];

bool ha(string a)
{

	

	int key = a.at(0) - '0';  // ó�� ���� key�� �д�.

	if (hashtable[key]!="") {		//�̹� �����ϸ�
		int length = hashtable[key].length() < a.length() ? hashtable[key].length() : a.length();
		//���� ���ڿ� ��������

		for (int i = 1; i < length; i++)
		{
			if (hashtable[key].at(i) != a.at(i)) {
				return true;
			}

		}
		return false;

	}
	
	// �ؽ� ���̺� �ִ´� 
	hashtable[key] = a;

	return true;

}

bool solution(vector<string> phone_book)
{
	bool answer;
	for (int i = 0; i < phone_book.size(); i++)
	{
		answer=ha(phone_book.at(i));
		if (answer == false)break;
	}

	return answer;

}




int main() {

	cout << solution(phone_book);



}