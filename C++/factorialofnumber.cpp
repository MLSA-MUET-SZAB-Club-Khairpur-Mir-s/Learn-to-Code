#include <iostream>

using namespace std;

int main()
{
  int n,factorial=1;
  cout <<"Enter any positive number "<<endl;
  cin >>n;

  for (int i=1;i<=n;i++){
      factorial*=i;
     //1*1=1
    //f=1
  }
// first time loop execute print the number f=1  loop terminated when i=n .
  cout <<n<< " factorial ="<<factorial<<endl;

    return 0;
}
