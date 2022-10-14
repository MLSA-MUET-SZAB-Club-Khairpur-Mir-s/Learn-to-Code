#include <iostream>
using namespace std;
struct stud
{
    char name[100];
    int cl, roll, ph, ch, math, cs;
} s;

char grade(int marks)
{
    switch (marks / 10)
    {

    case 10:
    case 9:
        return 'O';
        break;

    case 8:
        return 'A';
        break;

    case 7:
        return 'B';
        break;

    case 6:
        return 'C';
        break;

    case 5:
        return 'D';
        break;

    default:
        return 'F';
        break;
    }
}

int main()
{
    int n, avgM, totalM;
    cout << "Enter the Name of Student:";
    gets(s.name);
    cout << "Enter Class and  Roll No:";
    cin >> s.cl >> s.roll;
    cout << "Enter the Marks of Physics Chemistry  Maths  and Computer Science\n";
    cin >> s.ph >> s.ch >> s.math >> s.cs;
    totalM = (s.ph + s.ch + s.math + s.cs);
    avgM = totalM / 4;
    cout << "_______________________________________________________________________________\n";
    cout << "\t\t\tMARKSHEET\n";
    cout << "\t\t       -----------\n"
         << endl;

    cout << "STUDENT'S NAME: " << s.name;
    cout << "\nROLL NO: " << s.roll << "\n\n";
    cout << " _______________________________________________________________________\n";
    cout << " |  SUBJECT \t        |     MARKS   |\t GRADE   |\tTOTAL MARKS    | \n ";
    cout << "|______________________|_____________|__________|_____________________| \n";
    cout << " | Physics \t\t|     " << s.ph << "      |   " << grade(s.ph) << "\t |" <<  "\t\t       |" <<endl;
    cout << " | Chemistry\t\t|     " << s.ch << "      |   " << grade(s.ch) << "\t |\t  " << totalM << "\t       |" << endl;
    cout << " | Mathematics\t\t|     " << s.math << "      |   " << grade(s.math) << "\t |"  << "\t\t       |"<< endl;
    cout << " | Computer Science\t|     " << s.cs << "      |   " << grade(s.cs) << "\t |" << "\t\t       |" <<endl;
    cout << " |______________________|_____________|__________|_____________________|\n";
    cout<<"    Overall Grade :"<<grade(avgM)<<endl;
    return 0;
}