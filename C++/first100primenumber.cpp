 //first100semiprimenumber
   #include<iostream>
   using namespace std;
   bool isPrime(int n){
       for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
        }
       }
   return true;
   }
int main(){
     int counter=0;
     for(int i=4;counter!=100;i++){
        for(int j=2;j<i;j++){
            if(i%j==0 &&isPrime(j)&&isPrime(i/j)){
                cout<< i << " ";
                counter++;
                break;
    }
        }

     }
