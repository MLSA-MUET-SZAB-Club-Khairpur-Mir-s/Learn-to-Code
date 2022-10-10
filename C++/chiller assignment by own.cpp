#include<iostream>
using namespace std;
int main(){
	int lok,lol;
	cin>>lok;
	lol=lok/5000;
	lok%5000;
	cout<<"notes of 5000 rs "<<lol<<endl;
	lol=lok/1000;
    lok%1000;
	cout<<"notes of 1000 rs "<<lol<<endl;
	lol=lok/500;
	lok%500;
	cout<<"notes of 500 rs "<<lol<<endl;
	lol=lok/100;
	lok%100;
	cout<<"notes of 100 rs "<<lol<<endl;
	lol=lok/50;
    lok%50;
    cout<<"notes of 50 rs "<<lol<<endl;
    lol=lok/20;
	lok%20;
	cout<<"notes of 20 rs "<<lol<<endl;
	lol=lok/10;
	lok%10;
	cout<<"notes of 10 rs "<<lol<<endl;
	lol=lok/5;
	lok%5;
	cout<<"coins of 5 rs "<<lol<<endl;
	lol=lok/1;
	lok%1;
	cout<<"coins of 1 rs "<<lol<<endl;
}
