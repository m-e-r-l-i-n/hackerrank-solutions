# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
count={}
a=list(map(int,input().rstrip().split()))
for i in a:
    if i not in count:
        count[i]=0
    count[i]+=1    
ans=0
for i,j in count.items():
    if j!=n:
        ans=i
        break
print(ans)    
