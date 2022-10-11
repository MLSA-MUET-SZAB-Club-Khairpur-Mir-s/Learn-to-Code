#include <iostream>
using namespace std;
int main ()
{cout << "Enter password: ";
    string inPut; getline(cin, inPut);
    bool num=false, spChar=false;
    bool lowerAlpha=false, upperAlpha=false;
    for(int i=0; i<inPut.size(); i++){
        if(inPut[i]>='0' && inPut[i]<='9')
            num=true;
        else if(inPut[i]>='a' && inPut[i]<='z')
            lowerAlpha=true;
        else if(inPut[i]>='A' && inPut[i]<='Z')
            upperAlpha=true;
        else spChar=true; }
    cout << "Password is ";
    if(num && lowerAlpha && upperAlpha && spChar)
        cout << "very strong.";
    else if(num && lowerAlpha && spChar)
        cout << "strong.";
    else if(num && (lowerAlpha || upperAlpha))
        cout << "good.";
    else cout << "weak";
    return 0;}
