
// find intersection of two sorted Arrays in C++..
#include <iostream>
using namespace std;

int main() {
 
   int arr1[100], arr2[100], len1, len2, i, p = 0, q = 0;
 
   cout << "Enter lenght of first array (Max 100) \n";
   cin  >> len1;
 
   cout << " Enter sorted values for first array \n";
 
   for (i = 0; i < len1; i++) {
  
      cin >> arr1[i];
  
   }
 
   cout << "Enter length of second array (Max 100) \n";
   cin  >> len2;
 
   cout << " Enter sorted values for second array \n";
 
   for (i = 0; i < len2; i++) {
  
      cin >> arr2[i];
  
   }
 
 
   while (p <= len1 && q <= len2) {
  
      if (arr1[p] < arr2[q]) {
          //by Hasnain Ali
   
         p++;
   
      } else if (arr2[q] < arr1[p]) {
   
         q++;
   
      } else if (arr1[p] == arr2[q]) {
   
         cout << arr1[p] <<" ";
   
         p++;
         q++;
   
      }
  
   }
 
   return 0;
}
