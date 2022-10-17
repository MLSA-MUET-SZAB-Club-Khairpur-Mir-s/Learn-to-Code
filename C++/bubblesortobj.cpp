#include <iostream>
#include <conio.h>
using namespace std;
class A
{
    private:
    int n;

    public:
    void func(){
        int size;
        cout<<"Enter the size of array ";
        cin>>size;
        n=size;
    }

    int B[];

    void func1();

    void check(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(B[j]<B[j+1]){
                    int temp=B[j];
                    B[j]=B[j+1];
                    B[j+1]=temp;
                }
            }
        }
    }
    void print(){
        cout<<"Sorted list is"<<endl;
        for(int i=0; i<n;i++){
           
            cout<<B[i]<<" ";
        }
    }
};
void A::func1(){
    for(int i=0; i<n; i++){
        cout<<"Enter "<<i+1<<" number ";
        cin>>B[i];
    }
}

int main(){
    A obj;
    obj.func();
    obj.func1();
    obj.check();
    obj.print();
    getch();
    return 0;
}