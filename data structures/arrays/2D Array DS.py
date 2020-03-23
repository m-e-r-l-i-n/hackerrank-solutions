#!/bin/python

import math
import os
import random
import re
import sys

# Complete the hourglassSum function below.
def hourglassSum(arr):
    list_of_sum = []

    for row in range(0,4):
        for col in range(0,4):

            if(arr[row][col] >= -9 and arr[row][col] <= 9):

                add = arr[row][col] + arr[row][col+1]+ arr[row][col+2]+ arr[row+1][col+1]+arr[row+2][col] + arr[row+2][col+1]+arr[row+2][col+2]

                list_of_sum.append(add)
            else:
                return "input out of range"
                break

    highest = list_of_sum[0]
    for add in list_of_sum:
        if(add > highest):
            highest = add

    return highest        




if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in xrange(6):
        arr.append(map(int, raw_input().rstrip().split()))

    result = hourglassSum(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
