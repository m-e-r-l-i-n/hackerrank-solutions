#!/bin/python

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    nd = raw_input().split()

    n = int(nd[0])

    d = int(nd[1])

    a = map(int, raw_input().rstrip().split())
    if(n >= 1 and n <= 10**5 and d >= 1 and d <= n):
        dup = []
        dup = a[d:n] + a[0:d]
        for pos in range(0,n):
            print (dup[pos]),
