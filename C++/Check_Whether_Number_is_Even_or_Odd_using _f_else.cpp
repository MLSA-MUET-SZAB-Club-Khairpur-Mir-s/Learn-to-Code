#include <iostream>
using namespace std;

int main() {
  int n;

  cout << "Enter a Number: ";
  cin >> n;

  if ( n % 2 == 0)
    cout << n << "even.";
  else
    cout << n << "odd.";

  return 0;
}
