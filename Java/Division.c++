#include <iostream>
#include <conio.h>
using namespace std;

int main()
{
    int val1,val2,answer=0;

    cout<<"Enter two number for input: ";
    cin>>val1>>val2;
     while(val1>=val2) {
            val1=val1-val2;
     answer++;
     }
     cout<<"Division is: "<<answer;
     getch();
     return 0;
}
