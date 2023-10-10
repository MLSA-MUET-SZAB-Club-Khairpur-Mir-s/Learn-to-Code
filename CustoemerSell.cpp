#include <iostream>
#include <conio.h>
using namespace std;

struct daraz_customer{
    string name;
    string email;
    int id ;
    int age;
    string item;
    int quantity;
    float price;
    float dis;
    string time;
};
int main(){
    int num;
    daraz_customer  customer;
    cout<<"Enter the number of customers for storing their data ";
    cin>>num;

    int arry [num];
    for(int i=0; i<num; i++){

    cout<<"Enter the name of customer "<<""<<i+1<<" ";
    cin.ignore();
    getline(cin,customer.name);
    cout<<"Enter the Email of customer ";
    cin>>customer.email;
    cout<<"Enter the id of customer ";
    cin>>customer.id;
    cout<<"Enter the age of customer ";
    cin>>customer.age;
    cout<<"Enter the item bought by the customer ";
    cin.ignore();
    getline(cin,customer.item);
    cout<<"Enter the quantity of items bought by the customer ";
    cin>>customer.quantity;
    cout<<"Enter the total price of customer ";
    cin>>customer.price;
    cout<<"Enter the discount given to customer ";
    cin>>customer.discount;
    cout<<"Enter the date and time  of purchase ";
    cin.ignore();
    getline(cin,customer.time);

    cout<<"\n";

    cout<<"Name of Customer "<<i+1<<" " <<customer.name<<endl;
    cout<<"Email of Customer "<<customer.email<<endl;
    cout<<"ID of Customer "<<customer.id<<endl;
    cout<<"Age of  Customer "<<customer.age<<endl;
    cout<<"Item bought by the customer "<<customer.item<<endl;
    cout<<"Quantity of items bought "<<customer.quantity<<endl;
    cout<<"Total price of Items "<<customer.price<<endl;
    cout<<"Discount given to customer "<<customer.discount<<endl;
    cout<<"Price to pay after discount "<<customer.price-customer.discount<<endl;
    cout<<"The time of purchasing item is "<<customer.time<<endl;
    cout<<"\n";

    }
return 0;}
