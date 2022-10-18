#include<iostream>

using namespace std;
int glo=6;
void sum(){
    int a; 
    cout<< glo;
}

int main(){
    int glo=9;
    glo=78;
    // int a = 15;
    // int b = 14;
    int a=15 ,b=14;
    float pi = 3.14;
    char c = 'd';
    bool is_true = false;
    sum();
    cout<<glo<< is_true;
    // cout<<"This is tutorial 4.\n Here the value of a is"<<a<<"The value of b is "<< b;
    // cout<<"The value of pi is: "<<pi;
    // cout<<"\nThe value of c is:"<<c;
    return 0;
}