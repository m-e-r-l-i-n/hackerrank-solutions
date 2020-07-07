problem link-https://www.hackerrank.com/challenges/no-idea/problem

# Enter your code here. Read input from STDIN. Print output to STDOUT
n,m=input().split()
ar=input().split()
a=set(input().split())
b=set(input().split())
print(sum([(i in a)-(i in b) for i in ar]))
