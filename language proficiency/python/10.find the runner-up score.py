problem link-https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem

if __name__ == '__main__':
    n = int(input())
    #arr = map(int, input().split())
    arr = list(map(int, input().split()))
    largest = max(arr)

    for i in range(n):
        if largest == max(arr):
            arr.remove(max(arr))

    print(max(arr))


