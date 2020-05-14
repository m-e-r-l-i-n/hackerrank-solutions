problem link-https://www.hackerrank.com/challenges/find-a-string/problem

def count_substring(s, sub):
    lps=[0]*len(sub)
    i=1
    l=0
    while i<len(sub):   #longest prefix suffix values
        if sub[i]==sub[l]:
            l+=1
            lps[i]=l
            i+=1
        else:
            if l!=0: l=lps[l-1]
            else :
                lps[i]=l
                i+=1
    i=0
    ans=0
    j=0
    next_i=0            
    while i<len(s): #kmp
        if s[i]==sub[j]:
            i+=1
            j+=1
        if j==len(sub):
            j=lps[j-1]
            ans+=1
            if lps[j]!=0: 
                next_i+=1
                i=next_i 
        elif i<len(s) and sub[j]!=s[i]:
            if j!=0: j=lps[j-1]
            else: i+=1
    return ans

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
