
#include <iostream>

using namespace std;

int main()
{
  int n,fact=1;
  cout <<"enter any positive number ";
  cin >>n;
  cout <<endl;

  for (int i=1;i<=n;i++){
      fact*=i;
  }
  cout <<n<< " factorial ="<<fact;

    return 0;
}
