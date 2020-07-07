def minion_game(string):
    # your code goes here
    k=0
    s=0
    n=len(string)
    v="AEIOU"
    for i in range(n):
        if string[i] in v: k+=n-i
        else: s+=n-i
    ans=""
    if k>s: ans="Kevin "+str(k)
    elif s>k: ans="Stuart "+str(s)
    else: ans="Draw "
    print(ans)

if __name__ == '__main__':
    s = input()
    minion_game(s)
