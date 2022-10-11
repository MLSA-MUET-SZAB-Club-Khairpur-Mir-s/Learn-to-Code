#include<iostream>
using namespace std;
int main ()
{
	int pin=0;
	cout<<"enter pin: ";
	cin>>pin;
	int counter=0;
	do{
	if(pin==135);
	cout<<"access denied : "<<endl;
	counter++;
	if(counter==3){
	cout<<"system locked : "<<endl;
	break;
	}
	cout<<"enter pin: ";
	cin>>pin;
	}
	while(pin!=135);
	cout<<"access granted :"<<endl;
	return 0;
}
