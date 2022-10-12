#include<iostream>
using namespace std;
int main(){
	int arr[4]={4,8,2,5};
	int max=arr[0];
	for(int i=1;i<5;i++){
		if(arr[i]>max){
			max=arr[i];
		}

	} 
		int index =0;
	for(int i=1;i<5;i++){
		if(arr[i]>arr[index]){
			index=i;
		}
	}
	
cout<<"greater no is ="<<max<<" stored in index ="<<index;
	
}
