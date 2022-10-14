#include <iostream>
using namespace std;
//addition function
long double add(long double a,long double b){
     long double sum=a+b;
     return sum;
}//subtraction function
long double sub(long double a,long double b){
    long double subtraction=a-b;
    return subtraction;
}//multiplication function
long double mult(long double a,long double b){
    long double multiply=a*b;
    return multiply;
}//division function
long double div(long double a,long double b){
     long double division=a/b;
     return division;
}

int main(){
    long double num1,num2;
    char opr;
    cout<<"Enter the value of first number"<<endl;
    cin>>num1;
    cout<<"Enter the value of second number"<<endl;
    cin>>num2;
    cout<<"Enter the operator(+,-,*,/)"<<endl;
    cin>>opr;
if(opr == '+'){
    cout<<"The addition of:\n"<<num1<<"+"<<num2<<"="<<add(num1,num2)<<endl;
  }else if(opr =='-'){
    cout<<"The subtraction of:\n"<<num1<<"-"<<num2<<"="<<sub(num1,num2)<<endl;
}else if(opr == '*'){
    cout<<"The multiplication of:\n"<<num1<<"*"<<num2<<"="<<mult(num1,num2)<<endl;
}else if(opr == '/'){
    cout<<"The division of:\n"<<num1<<"/"<<num2<<"="<<div(num1,num2)<<endl;
}else{
   cout<<"Invalid operator!please try again"<<endl;
}

return 0;
}
