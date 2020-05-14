problem link-https://www.hackerrank.com/challenges/c-tutorial-basic-data-types/problem

#include <iostream>
#include <cstdio>
#include <iomanip>
using namespace std;

int main() {
    // Complete the code.
    int i; char c; long l; float f; double d;
    cin>>i>>l>>c>>f>>d;
    printf("%d\n%ld\n%c\n%.3f\n%.9lf", i,l,c,f,d);
    return 0;
}
