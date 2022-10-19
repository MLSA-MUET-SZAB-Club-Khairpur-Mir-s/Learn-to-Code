#include <iostream>
#include <bits/stdc++.h>
#define ll long long int

using namespace std;

int main() {

int n,m;
cin>>n>>m;
    int a[n][m];
    for(ll i=0;i<n;i++){
        for(ll j=0;j<m;j++){
            cin>>a[i][j];
        }
    }
    int t[m][n]={0};
    for(ll i=0;i<n;i++){
        for(ll j=0;j<m;j++){
            t[j][i]=a[i][j];
        }
    }
     for(ll i=0;i<m;i++){
        for(ll j=0;j<n;j++){
            cout<<t[i][j]<< " ";
        }
        cout<<endl;
    }


    return 0;
}