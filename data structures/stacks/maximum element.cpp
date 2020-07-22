problem link-https://www.hackerrank.com/challenges/maximum-element/problem

#include <bits/stdc++.h>
using namespace std;

int main() 
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    vector <int> v;
    int n,max=0;
    cin>>n;
    while(n-->0)
    {
        int c;
        cin>>c;
        if(c==1)
        {
            int t;
            cin>>t;
            v.push_back(t);
            if(t>max)
            max=t;
        }
        if(c==2)
        {
            v.pop_back();
            if(v.size()==0) max=0;
            else 
            {
                vector <int>v1; 
                v1=v; 
                sort(v1.begin(),v1.end());
                max=v1[v1.size()-1];
            }
        }
        if(c==3)
        cout<<max<<endl;

    }
    return 0;
}
