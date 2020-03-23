#!/bin/python

import math
import os
import random
import re
import sys

#
# Complete the 'dynamicArray' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER n
#  2. 2D_INTEGER_ARRAY queries
#

def dynamicArray(n, queries):
    # Write your code here
    seqList = []
    for i in range(0,n):
        seqList.append([])
    lastAnswer = []
    lastAnswer2 = 0
    for i in range(0,len(queries)):
        query = queries[i][0]
        x = queries[i][1]
        y = queries[i][2]
        if(x >= 0 and x <= 10**9 and y >= 0 and y<= 10**9):
            seq = ((x ^ lastAnswer2) % n)
            if query == 1:
                seqList[seq].append(y)
            elif query == 2:
                pos = y % (len(seqList[seq]))
                lastAnswer.append(seqList[seq][pos])
                lastAnswer2 = seqList[seq][pos]
        else:
            lastAnswer = ""
            break   
    return lastAnswer


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = raw_input().rstrip().split()

    n = int(first_multiple_input[0])

    q = int(first_multiple_input[1])
    if(n >= 1 and n <= 10**5 and q >= 1 and q <= 10**5):
        queries = []

        for _ in xrange(q):
            queries.append(map(int, raw_input().rstrip().split()))

        result = dynamicArray(n, queries)

        fptr.write('\n'.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
