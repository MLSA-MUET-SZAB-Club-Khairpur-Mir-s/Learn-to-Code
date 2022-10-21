#include<iostream>
using namespace std;

class SPARSE
{
    unsigned short int M,N,S[10][10],T[50][3],size;
public:
    SPARSE();
    private:
    void Process(int);
};

SPARSE::SPARSE()
{
    int i,j,size=0;
    cout<<"enter row and column size\n";
    cin>>M>>N;
    S[M][N];
    cout<<"enter elements \n";
    for(int i=0;i<M;i++)
    {
        for(int j=0;j<N;j++)
        {
            cin>>S[i][j];
        }
    }
    cout<<"elements in the sparse matrix are \n";
    for(int i=0;i<M;i++)
    {
        for(int j=0;j<N;j++)
        {
            cout<<S[i][j]<<"\t";
        }
        cout<<endl;
    }
    for(i=0;i<M;i++)
    {
        for(j=0;j<N;j++)
        {
            if(S[i][j]!=0)
            {
                size++;
            }
        }
    }
    cout<<"Size is "<<size<<endl;
    Process(size);

}
void SPARSE::Process(int s)
{
    T[3][s];

    int k=0;
for(int i=0;i<M;i++)
{
        for(int j=0;j<N;j++)
        {
                if(S[i][j]!=0)
                {

                T[0][k]=i;
                T[1][k]=j;
                T[2][k]=S[i][j];
                k++;
                }
        }
}
cout<<"3 tuple representation of sparse matrix is "<<endl;
for(int i=0;i<3;i++)
{
    for(int j=0;j<s;j++)
    {
        cout<<T[i][j]<<"\t";
    }
    cout<<endl;
}
}

int main()
{
    SPARSE s;
}
