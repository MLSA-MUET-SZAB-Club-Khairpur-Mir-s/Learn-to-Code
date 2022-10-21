#include<iostream>
using namespace std;

class matrix
{
    unsigned short int m,n,q,a[10][10],b[10][10],c[10][10];
    void product();
    public: matrix();
};

matrix::matrix()
{
    int i,j;
    cout<<"\nEnter row and column size of matrix A : "; cin>>m>>n;
    cout<<"\nEnter matrix A : \n";
    for(i=0;i<m;i++)
    for(j=0;j<n;j++)
    cin>>a[i][j];

    cout<<"\nEnter no. of columns of matrix B : ";
    cin>>q;
    cout<<"\nEnter matrix B: \n";
    for(i=0;i<n;i++)
    for(j=0;j<q;j++)
    cin>>b[i][j];

    product();

}

void matrix::product()
{
  cout<<"Product of 2 matrices is :\n";

  for(int i=0;i<m;i++)
  {
      for(int j=0;j<q;j++)
      {
          c[i][j]=0;

          for(int k=0;k<n;k++)
          {
              c[i][j]+=a[i][j]*b[i][j];
          }
          cout<<c[i][j]<<"\t";
      }
      cout<<"\n";
  }

}

int main()
{
    matrix z;
    return 0;
}
