#include<iostream>
#include<string>
#include<algorithm>

using namespace std;
int consumer[10];
int m[10];
bool visit[10];

int main() {
	int a=0; // �޼��� ����
	int b=0;  // consumer ���� 
	cin >> a >> b;
	int count = 0;

	for (int i = 0; i < a; i++)
	{
		cin >> m[i];
	}
	// ������ �Է� 
	int time = 1;
	int index = 0;
	

	while (count != a) // �޼����� ��� ó�� �ɋ� ���� 
	{

		for (int i = 0; i < b; i++)
		{

			if (consumer[i] < time && !visit[index])
			{
				consumer[i] += m[index];
				index = true;
				index++;
				count++;
			}


		}
		time++;
	}
	int answer = 0;
	
	for (int i = 0; i < b; i++)
	{
		
		if (answer < consumer[i]) answer = consumer[i];
	}

	
	




}