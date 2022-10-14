#include <iostream>
using namespace std;
struct customer{
   string name;
   string email;
   int id;
   int age;
   string purchaseitem;
   int itemquantity;
   string time;
};
int main(){
   int counter=1;
   customer  c1;
   for(int i=1;i<=3;i++){
    cout<<"\n\n";
    cout<<"Customer:"<<counter<<endl;
    cout<<"Enter your name:";
    cin>>c1.name;
    cout<<"Enter your email:";
    cin>>c1.email;
    cout<<"Enter your id:";
    cin>>c1.id;
    cout<<"Enter your age:";
    cin>>c1.age;
    cout<<"Enter product name:";
    cin>>c1.purchaseitem;
    cout<<"Enter your quantity:";
    cin>>c1.itemquantity;
    cout<<"Enter time here:";
    cin>>c1.time;
    cout<<"\n\n";
    cout<<"Customer Data:"<<endl;
    cout<<"\n\n";
    cout<<"Name: "<<c1.name<<endl;
    cout<<"Email: "<<c1.email<<endl;
    cout<<"ID: "<<c1.id<<endl;
    cout<<"Age: "<<c1.age<<endl;
    cout<<"Item: "<<c1.purchaseitem<<endl;
    cout<<"Quantity: "<<c1.itemquantity<<endl;
    cout<<"Time: "<<c1.time<<endl;
    cout<<"Thanks for coming :) "<<endl;
    counter++;
}return 0;}
