problem link-https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem

#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

// Complete the decentNumber function below.
void decentNumber(int n) {
    int i,th=0,fi=0;
    for(i=0;i<=n;i++)
    if(i%3==0 && (n-i)%5==0) {fi=i; th=n-i;}
    if(fi==0 && th==0) printf("-1\n");
    else
    {
        for(i=0;i<fi;i++)
        printf("%d",5);
        for(i=0;i<th;i++)
        printf("%d",3);
        printf("\n");
    }

}

int main()
{
    string t_temp;
    getline(cin, t_temp);

    int t = stoi(ltrim(rtrim(t_temp)));

    for (int t_itr = 0; t_itr < t; t_itr++) {
        string n_temp;
        getline(cin, n_temp);

        int n = stoi(ltrim(rtrim(n_temp)));

        decentNumber(n);
    }

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}
