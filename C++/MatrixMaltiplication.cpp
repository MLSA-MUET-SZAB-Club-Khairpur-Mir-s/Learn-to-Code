#include <iostream>
using namespace std;
int main(){
   int row1 , row2 , column1 , column2;
   int result[3][3]={0};
   cout<<"Enter the rows of first matrix ";
   cin>> row1;
   cout<<"Enter the column first matrix ";
   cin>>column1;
   cout<<"You entered matrix of ["<<row1<<"]"<<"["<<column1<<"]"<<endl<<endl;

   //taking input for the first matrix
   cout<<"Enter the values of the first matrix "<<endl;
   int arr[row1][column1];
   for(int i=0; i<row1; i++){
    for(int j=0; j<column1; j++){
    cout<<"Enter the element a"<<i+1<<j+1<<" ";
     cin>>arr[i][j];
    }
   }
    cout<<"\n";
   cout<<"Enter the rows of second matrix ";
   cin>> row2;
   cout<<"Enter the column second matrix ";
   cin>>column2;
   cout<<"You entered matrix of ["<<row2<<"]"<<"["<<column2<<"]"<<endl<<endl;

    //taking input for the second matrix
    cout<<"Enter the values of second matrix "<<endl;
    int arry [row2][column2];
    for(int i=0; i<row2; i++){
       for(int j=0; j<column2; j++){
        cout<<"Enter the element  b"<<i+1<<j+1<<" ";
        cin>>arry[i][j];
       }
    } cout<<endl;

    //printing the values of first matrix
    cout<<"The elements of first matrix are"<<endl;
    for(int i=0; i<row1; i++){
        cout<<"[";
       for(int j=0; j<column1; j++){
        cout<<arr[i][j]<<"  ";
       }
       cout<<"]"<<endl;
    }
     //printing the values of second matrix
     cout<<"The elements of second matrix are"<<endl;
     for(int i=0; i<row2; i++){
        cout<<"[";
       for(int j=0; j<column2; j++){
        cout<<arry[i][j]<<"  ";
       }
       cout<<"]"<<endl;
    }
   if(column1==row2){
    cout<<"Multiplication is possible "<<endl;
    int sum;
    cout<<"Matrix multiplication "<<endl;
    for(int i=0; i<row1; i++){
         cout<<"[";
       for(int j=0; j<column2; j++){
            sum=0;
        for(int k=0; k<column1; k++){
         sum=sum+arr[i][k]*arry[k][j];
        }
       cout<<sum<<"  ";
       }
       cout<<"]"<<endl;
    }
   }
   else{
       cout<<"Multiplication is not possible ";
   }
return 0;}
