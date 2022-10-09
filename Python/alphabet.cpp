// #include <iostream>
// using namespace std;
// int main(){
// 	char i;
// 	cout<<"enter an alphabet";
// 	cin>>i;
// 	 if (i == 'a' || i == 'e' || i== 'i' || i=='o' || i=='u'){
// 		cout<< i << "  is a vowel";
// 	}	
// 	else{
// 		cout<< i << " is a consonant";
// 	}
// }
// Since it is a Python folder(Same code in python)
alpha=input("Enter a Alphabet : ")
if (alpha.lower() or alpha.upper()) in ('A','a','e','E','i','I','o','O','U','u'):
    print(alpha, "is a Vowel")
else:
    print(alpha,"is not a Vowel ")
