#include<iostream>
using namespace std;

int main(){
    int year;
    cin>>year;//Take the year as input

    if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)){ //Condition to check leap year
        cout<<"It is a leap year!"<<endl;
    }
    else{
        cout<<"It is not a leap year!"<<endl;
    }
    return 0;
}