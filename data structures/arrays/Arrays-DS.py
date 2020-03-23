#!/bin/python

import math
import os
import random
import re
import sys

# Complete the reverseArray function below.
def reverseArray(a):
    numbers = []
    length =  len(a)
    pos = length - 1
    for num in range(0,length):
        element = a[pos]
        if (element >= 1 and element <= 10**4):
            numbers.append(a[pos])
            pos -= 1
        else:
            numbers = ""
            break
    return numbers
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(raw_input())
    if(arr_count >= 1 and arr_count <= 10**3):

        arr = map(int, raw_input().rstrip().split())

        res = reverseArray(arr)

        fptr.write(' '.join(map(str, res)))
        fptr.write('\n')
    
    fptr.close()
