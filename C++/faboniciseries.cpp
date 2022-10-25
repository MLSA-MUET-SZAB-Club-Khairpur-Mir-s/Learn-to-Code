#include<iostream>
using namespace std;
int main()
{
	long long int arr[100];
	int n;
	cout<<"Enter Number of Fibonacci Terms required:";
	cin>>n;
	// first two terms
	arr[0]=0;
	arr[1]=1;
	// use for loop for remaining terms
	for(int i=2;i<n;i++)
	  arr[i]=arr[i-1]+arr[i-2];

	cout<<"Required "<<n<<" Fibonacci Terms are:"<<endl;
	for (int i=0;i<n;i++)
	cout<<arr[i]<<", ";

	return 0;
}
