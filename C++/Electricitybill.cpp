#include <iostream>

using namespace std;

int main()
{  
    //Declaring unit variables 
    int unit, unit2, unit3;
    cout<<"Enter the units"<<endl;
    cin>>unit;
    //Initializing unit variable If units are above 100.
    unit2=unit-200;
    //Initializing unit variable If units are above 200.
    unit3=unit-300;
    //using control structure according to less or more usage of units
    if(unit<=200 )
        cout<<"Your electricity bill is " << unit*4;


       else if(unit<=300)
        cout<<"Your electricity bill is " << 400+unit2*6;

       else if(unit>300)
        cout<<"Your electricity bill is " << 1000 +unit3*8<<endl;

    return 0;
}
