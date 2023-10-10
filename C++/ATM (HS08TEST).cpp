// atm project prototypt is being builded
#include<iostream>
using namespace std;
// main method one
int main(){
    float balance;
    int amount;
    //3

    cin>>amount>>balance;


    if(amount%5==0 && amount<=balance-0.50){
    balance=balance-(amount+0.50);
        cout<<balance<<endl;
    }
    else{
        cout<< balance<<endl;
    }
    return 0;
}
