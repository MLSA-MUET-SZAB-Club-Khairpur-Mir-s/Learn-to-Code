#include <iostream>
using namespace std;

int main() {
  int n1, n2, hcf1;
  cout << "Enter two numbers: ";
  cin >> n1 >> n2;

  // swapping variables n1 and n2 if n2 is greater than n1.
  if ( n2 > n1) {   
    int temp1 = n2;
    n2 = n1;
    n1 = temp1;
  }
    
  for (int i = 1; i <=  n2; ++i) {
    if (n1 % i == 0 && n2 % i ==0) {
      hcf1 = i;
    }
  }

  cout << "HCF = " << hcf1;

  return 0;
}
