problem link-https://www.hackerrank.com/challenges/variable-sized-arrays/problem

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int n,q,i;
    cin>>n>>q;
    vector<int> a[n];
    for(i=0;i<n;i++)
    {
        int k,j,l;
        cin>>k;
        for(j=0;j<k;j++)
        {
            cin>>l;
            a[i].push_back(l);
        }
    }
    for(i=0;i<q;i++)
    {
        int x,y;
        cin>>x>>y;
        cout<<a[x][y]<<"\n";
    }
    return 0;
}
