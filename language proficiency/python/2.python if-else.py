problem link-https://www.hackerrank.com/challenges/py-if-else/problem

#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    k=0
    if n%2!=0: k=0
    elif (n%2==0) and (n>=2 and n<6):  k=1
    elif (n%2==0) and (n>=6 and n<21): k=0
    else: k=1
    if k==0:  print("Weird")
    else: print("Not Weird")
