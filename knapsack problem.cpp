#include<iostream>
#include<algorithm>
using namespace std;
int knapsack(int*weight,int*price,int capacity,int n)
{
	if(n==0 || capacity==0)
	{
		return 0;
	}
	int inc=INT_MIN, exc=INT_MIN;
	if(capacity>=weight[n-1])
	{
		inc=price[n-1]+knapsack(weight,price,capacity-weight[n-1],n-1);
		
	}
	exc=0+knapsack(weight,price,capacity,n-1);
	return max(inc,exc);
}

int main()
{
	int weight[]={1,2,3,5};
	int price[]={20,50,60,100};
	cout<<knapsack(weight,price,6,4);
}
