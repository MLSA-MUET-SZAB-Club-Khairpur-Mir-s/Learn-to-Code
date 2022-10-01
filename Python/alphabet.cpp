#include <iostream>
using namespace std;
int main(){
	char i;
	cout<<"enter an alphabet";
	cin>>i;
	 if (i == 'a' || i == 'e' || i== 'i' || i=='o' || i=='u'){
		cout<< i << "  is a vowel";
	}	
	else{
		cout<< i << " is a consonant";
	}
}
