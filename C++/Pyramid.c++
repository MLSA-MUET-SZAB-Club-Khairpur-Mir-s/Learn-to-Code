#include <iostream>
using namespace std;

//  Here is code how to  print Pyramid in C++

#include <iostream>
using namespace std;
int main() {
   int n = 6, i, j;
   for (i=1; i<=n; i++) {
      for(j=1; j<=i; j++ ) {
         cout << "* ";
      }
      cout << endl;
   }
   return 0;
}
