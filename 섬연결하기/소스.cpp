#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

struct type
{
	int start;
	int end;
	int edge;

};



vector<type> result;

bool compare(type a, type b)
{
	return a.edge < b.edge;
}



int n = 4;


int arr[101][101];
bool visit[101];
bool edge_visit[101][101];

bool check(bool visit[],int n)
{
	for (int i = 0; i < n; i++)
	{
		if (visit[i] == false)return false;
	}
	return true;
}



vector<vector<int>> costs = { {0,1,1},{0,2,3},{1,2,2} ,{2,3,4} };






int main() {
	int answer = 0;

	for (int i = 0; i < costs.size(); i++)
	{
		type temp;
		temp.start = costs[i][0];
		temp.end = costs[i][1];
		temp.edge = costs[i][2];

		result.push_back(temp);
	}
	sort(result.begin(), result.end(), compare);
	// 간선 값 순서대로 정렬 

	for (int i = 0; i < result.size(); i++)
	{
		arr[result[i].start][result[i].end] = result[i].edge;
		arr[result[i].end][result[i].start] = result[i].edge;
	}
	// 이차원 배열로 바꿈 

	answer += result[0].edge;

	visit[result[0].start] = true;
	visit[result[0].end] = true;
	edge_visit[result[0].start][result[0].end] = true;
	edge_visit[result[0].end][result[0].start] = true;
	while (!check(visit,n))
	{
		type next;
		int min = 100000;
		for (int i = 0; i < n; i++)
		{
			if (!visit[i])continue; // 방문한노드가 아니면 선 이용 x

			for (int j = 0; j < n; j++) // 방문한 노드 중에서 연결된 값중 최소값 
			{

				if (arr[i][j] != 0 && arr[i][j] < min && edge_visit[i][j] == false && visit[j] == false)
				{
					next.start = i;
					next.end = j;
					min = arr[i][j];
				}


				
			}


			
			
		}
		answer += min;
		visit[next.start] = true;
		visit[next.end] = true;
		edge_visit[next.start][next.end] = true;
		edge_visit[next.end][next.start] = true;
		
	}

	cout << answer;
	

}