// C++ code to demonstrate star pattern
#include <iostream>
using namespace std;
 
// Driver Code
int main()
{
    int n = 5;
   
    //looping rows
    for(int i=n; i>0; i--)
    {
      for(int j=0; j<=n; j++) //looping columns
      {
        if (j>=i)
        {
          cout<<"*";
        }
        else
        {
          cout<<" ";
        }
      }
      cout<<endl;
    }
    return 0;
}
