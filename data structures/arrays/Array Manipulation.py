#!/bin/python

import math
import os
import random
import re
import sys

# Complete the arrayManipulation function below.
def arrayManipulation(n, queries):
    arr =[]
    check = False
    largest = 0
    for i in range(0,n):
        arr.append(0)
    for query in queries:
        first = query[0]
        last = query[1]
        to_add = query[2]
        if(first>=1 and first<=n and last>=1 and last<=n and to_add>=0 and to_add<=10**9):  
            arr[first - 1] += to_add
            if(last < len(arr)):
                arr[last] -= to_add
        else:
            check = True
            break
    if not check:
        x = 0
        for diff in arr:
            x += diff
            if(x > largest):
                largest = x
    else:
        largest = ""
        
    return largest
            

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = raw_input().split()

    n = int(nm[0])

    m = int(nm[1])
    if(n >= 3 and n <= 10**7 and m >=1 and m <= 2*(10**5)):

        queries = []

        for _ in xrange(m):
            queries.append(map(int, raw_input().rstrip().split()))

        result = arrayManipulation(n, queries)

        fptr.write(str(result) + '\n')

    fptr.close()
© 2020 GitHub, Inc.
