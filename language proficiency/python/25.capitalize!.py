#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
import string
def solve(s):
    s=string.capwords(s,' ')
    return s

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
