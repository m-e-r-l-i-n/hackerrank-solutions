problem link-https://www.hackerrank.com/challenges/russian-peasant-exponentiation/copy-from/147749403

#!/bin/python3

import os
import sys

# Complete the solve function below.
def solve(a, b, k, m):
    if k==1: return a%m, b%m
    else:
        x,y= (a*a-b*b)%m,(2*a*b)%m
        x1,y1=solve(x,y,k//2,m)
        if k%2==1:
            x2,y2=(a*x1-b*y1)%m,(x1*b+a*y1)%m;
            x1,y1=x2,y2
        return x1,y1

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        abkm = input().split()

        a = int(abkm[0])

        b = int(abkm[1])

        k = int(abkm[2])

        m = int(abkm[3])

        result = solve(a, b, k, m)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
