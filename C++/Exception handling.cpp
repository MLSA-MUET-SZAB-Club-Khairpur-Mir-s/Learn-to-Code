#include <iostream>
#include <string.h>
using namespace std;

class rollercoster
{
public:
    string name;
    int age;
    /////////////////////////////////////////////////////////////////////
public:
    class EXCEPTION_error{};
    void getdata()
    {
        cout << "ENTER YOUR NAME :" << endl;
        cin >> name;
        cout << "ENTER YOUR AGE  :" << endl;
        cin >> age;
        if(age<18 || age > 40)
        {
            throw EXCEPTION_error();
        }
    }
    void showdata()
    {
        cout << "CONGRATULATIONS MR:" << name << " YOU CAN RIDE" << endl;
    }
    /////////////////////////////////////////////////////////////////////
};

int main()
{
    try
    {
        rollercoster p1;
        p1.getdata();
        p1.showdata();
    }
    catch (rollercoster::EXCEPTION_error)
    {
        cout << "SORRY :(  YOU ARE NOT ELIGIBLE FOR RIDE" << endl;
    }

    return 0;
}
