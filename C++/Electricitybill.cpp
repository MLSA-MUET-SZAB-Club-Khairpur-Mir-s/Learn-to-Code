#include <iostream>

using namespace std;

int main()
{  
    //Declaring unit variables 
    int unit, unit2, unit3;
    cout<<"Enter the value of units"<<endl;
    cin>>unit;
    //Initializing unit variable If units are above 100.
    unit2=unit-100;
    //Initializing unit variable If units are above 200.
    unit3=unit-200;
    //using control structure according to less or more usage of units
    if(unit<=100 )
        cout<<"Your electricity bill is " << unit*4;


       else if(unit<=200)
        cout<<"Your electricity bill is " << 400+unit2*6;

       else if(unit>200)
        cout<<"Your electricity bill is " << 1000 +unit3*8<<endl;

    return 0;
}
