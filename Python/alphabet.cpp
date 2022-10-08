#include <iostream>
using namespace std;
int main(){
	char i;
	cout<<"Enter an Alphabet";
	cin>>i;
	 if (i == 'a' || i == 'e' || i== 'i' || i=='o' || i=='u'){
		cout<< i << "  is a Vowel";
	}	
	else{
		cout<< i << " is a Consonant";
	}
}
