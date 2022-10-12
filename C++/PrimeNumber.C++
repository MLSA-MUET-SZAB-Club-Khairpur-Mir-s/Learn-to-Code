#include <iostream>
using namespace std;

int main() {

  // declaring variables 
  int i, n;
  bool is_prime = true;//this is prime code

  cout << "Enter a positive integer: ";
  // using input
  cin >> n;

  // 0 and 1 are not prime numbers
  if (n == 0 || n == 1) {
    is_prime = false; // here is false statement
  }

  // loop to check if n is prime
  for (i = 2; i <= n/2; ++i) {
    if (n % i == 0) {
      is_prime = false;
      break;
    }
  }
// using if condition 
  if (is_prime)
    cout << n << " is a prime number";
  // another condition using
  else
    cout << n << " is not a prime number";

  return 0;
}
