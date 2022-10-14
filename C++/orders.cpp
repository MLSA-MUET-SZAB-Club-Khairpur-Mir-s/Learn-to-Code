#include<iostream>
using namespace std;

void ascending(){
    int n,i,j,arr[n],temp;
    cout<<"Enter size of the array"<<endl;
    cin>>n;
    cout<<"Enter the elements of the array:"<<endl;
    for(i=0;i<n;i++){
        cin>>arr[i];
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    cout<<"The numbers in ascending order are......"<<endl;
    for(i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}

void descending(){
    int n,i,j,arr[n],temp;
    cout<<"Enter size of the array"<<endl;
    cin>>n;
    cout<<"Enter the elements of the array:"<<endl;
    for(i=0;i<n;i++){
        cin>>arr[i];
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    cout<<"The numbers in decending order are......"<<endl;
    for(i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}
int main(){
    int choice;
    do{
        cout<<"1.Sort in ascending order 2.Sort in descending order 3.Exit"<<endl;
        cout<<"Enter your choice"<<endl;
        cin>>choice;
        switch(choice){
            case 1:
            ascending();
            break;
            case 2:
            descending();
            break;
            case 3:
            exit(0);
            break;
            default:
            cout<<"It's an invalid choice! Please enter a valid choice!"<<endl;
            break;
        }
    }while(choice>0);
    return 0;
}