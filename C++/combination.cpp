#include <iostream>
using namespace std;
int main(){
    int n=4;
    char arry[n];
    cout<<"Enter numbers or characters to check its combinations:";
    cin>>arry;
   for(int i=0;  i<4; i++){
    for(int j=0; j<4; j++){
        if(j==i)continue;
       for(int k=0; k<4; k++){
           if(k==j || k==i)continue;
        for(int l=0; l<4; l++){
            if(l==k || l==j || l==i)continue;
         cout<<arry[i]<<arry[j]<<arry[k]<<arry[l]<<endl;
        }
       }
    }
   }
return 0;}
