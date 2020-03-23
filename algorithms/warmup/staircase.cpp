#include <bits/stdc++.h>

using namespace std;

// Complete the staircase function below.
void staircase(int n) {
int i,j,k;
for(i=1;i<=n;i++)
{
    for(k=n;k>i;k--)
    cout<<" ";
    for(j=1;j<=i;j++)
    cout<<"#";
    cout<<"\n";
}

}

int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    staircase(n);

    return 0;
}
