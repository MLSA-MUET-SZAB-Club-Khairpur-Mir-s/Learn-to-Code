#include<iostream>
using namespace std;


class MERGE
{
        unsigned short int ROLL;
        char NAME[30];
        float PERCENT;
        public:
        void get_data()
        {

                cin>>NAME>>ROLL>>PERCENT;
        }
        int get_roll()
        {
                return ROLL;
        }
        void put_data()
        {

                cout<<ROLL<<"\t"<<NAME<<"\t"<<PERCENT<<endl;
        }

};

int main()
{
        MERGE m1[40],m2[40],m3[100];
        int i,j,k,l,m,n;
        cout<<"Enter values for m and n"<<endl;
        cin>>m>>n;

        cout<<"Enter values of first array"<<endl;
        cout<<"Enter name  Roll no and Percent"<<endl;
        for(i=0;i<m;i++)
        {
                m1[i].get_data();
        }
        cout<<"Enter values of second array"<<endl;
        for(j=0;j<n;j++)
        {
                m2[j].get_data();
        }

        i=j=k=0;
                while(i<=m-1&&j<=n-1)
                {
                        if(m1[i].get_roll()<m2[j].get_roll())
                        {
                                m3[k]=m1[i];
                                i++;
                                k++;
                        }
                        else
                        {
                                m3[k]=m2[j];
                                j++;
                                k++;
                        }
                }
if(i==m)
{
        for(j;j<=n-1;j++)
        {
                        m3[k]=m2[j];

                        k++;
        }
}

if(j==n)
{
        for(i;i<=m-1;i++)
        {
                        m3[k]=m1[i];

                                k++;
        }
}
        cout<<"elements after merging"<<endl;
        cout<<"Roll no\t Name \t Percent"<<endl;
        for(l=0;l<m+n;l++)
        {
                m3[l].put_data();
        }
}
