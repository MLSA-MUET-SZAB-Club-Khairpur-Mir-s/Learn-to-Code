#include <iostream>
using namespace std;

int main()
{
    int n, i, t, choice;
    cout << "Enter the size of array" << endl;
    cin >> n;
    int a[n];
    for (int j = 0; j < n; j++)
    {
        cout << "Enter the value at index :" << j << "\t";
        cin >> a[j];
    }
    printf("Press 1 for Ascending Order and Press 2 for Descending Order...\n");
    cin >> choice;
    switch (choice)
    {
    case 1:
        i = 0;
        while (i < n)
        {
            for (int j = 0; j < n - i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            i++;
        }
        cout << "In Ascending order...\n ";
        for (int i = 0; i < n; i++)
        {
            cout << a[i] << "\t";
        }

        break;
    case 2:
        i = 0;
        while (i < n)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] < a[j + 1])
                {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            i++;
        }
        cout << "In Descending order...\n ";
        for (int k = 0; k < n; k++)
        {
            cout << a[k] << "\t";
        }

        break;
    default:
        cout << "Wrong Key" << endl;
        break;
    }

    return 0;
}
