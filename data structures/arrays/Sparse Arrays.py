#!/bin/python

import math
import os
import random
import re
import sys

# Complete the matchingStrings function below.
def matchingStrings(strings, queries):
    n = len(strings)
    q = len(queries)
    arr = []
    for query in queries:
        cnt = 0
        for string in strings:
            if(query == string):
                cnt += 1
        arr.append(cnt)
    return arr

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    strings_count = int(raw_input())
    if(strings_count >= 1 and strings_count <= 1000):

        strings = []

        for _ in xrange(strings_count):
            strings_item = raw_input()
            strings.append(strings_item)

        queries_count = int(raw_input())
        if (queries_count >= 1 and queries_count <= 1000):

            queries = []

            for _ in xrange(queries_count):
                queries_item = raw_input()
                queries.append(queries_item)

            res = matchingStrings(strings, queries)

            fptr.write('\n'.join(map(str, res)))
            fptr.write('\n')

    fptr.close()
