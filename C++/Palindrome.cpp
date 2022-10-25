 #include <iostream>
 using namespace std;

 bool reverse(int(i)){
    int n=i, reverseNumber=0, remainder=0;
    while(i!=0){
        remainder=i%10;
        reverseNumber=reverseNumber*10+remainder;
        i/=10;
    }
    if(n!=reverseNumber)
        return false;
 }
    int main(){
        cout<<"Palindrome Series:"<<endl;
        int i, palindrome=0;
        int array[1099];
        for(i=1; i<100000; i++){
            if(reverse(i)){
                array[palindrome]=i;
                palindrome++;
            }}
        for(i=0; i<=palindrome; i++){
            cout<<array[i]<<" ";
        }
    return 0;}
