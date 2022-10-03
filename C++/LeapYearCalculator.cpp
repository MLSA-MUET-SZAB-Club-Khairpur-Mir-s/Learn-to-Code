#include<iostream>
using namespace std;
int main()
{
    int year;
    cout<<"Enter the Year: ";
    cin>>year;
    if((year%4==0) && (year%100!=0))
        cout<<"\nIt is a Leap Year";
    else if(year%400==0)
        cout<<"\nIt is a Leap Year";
    else
        cout<<"\nIt is not a Leap Year";
    cout<<endl;
    return 0;
}