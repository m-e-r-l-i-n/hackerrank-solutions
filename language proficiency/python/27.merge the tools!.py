problem link-https://www.hackerrank.com/challenges/merge-the-tools/problem

def merge_the_tools(s, k):
    # your code goes here
    i=0
    j=k
    while j<=len(s):
        c=[0]*26
        ans=""
        for x in range(i,j):
            if c[ord(s[x])-ord('A')]==0:
                ans+=s[x]
                c[ord(s[x])-ord('A')]+=1
        i=j
        j+=k
        print(ans)


if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
