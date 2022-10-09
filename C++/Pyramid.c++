#include <iostream>
using namespace std;

int main()
{
    int rows=NULL; 
    char element;
    cout << "Enter the number of Rows : "; 
    cin >> rows; // input rows
    cout << "Enter a Character : "; 
    cin >> element; // input rows

    for(int i = 1; i <= rows; ++i)
    {
        for(int j = 1; j <= i; ++j)
        {
            cout <<element ;
        }
        cout << "\n";
    }
    return 0;
}
