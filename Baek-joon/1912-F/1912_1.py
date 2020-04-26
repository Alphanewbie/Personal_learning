# https://www.acmicpc.net/problem/1912
# 반례
# 175
# 1991 -9326 -9974 4360 829 -2259 -6922 -2954 -1752 -8432 6030 -3428 292 -4902 704 4019 4247 6878 -2883 -8022 -5923 -9367 -5010 -7119 -5626 4631 8666 2424 -8063 5493 -934 3928 6168 -907 -1712 -3004 6834 1367 4043 -4919 2935 72 1654 -6773 5170 -7642 7247 -583 9236 -5637 1395 -6687 -5003 6385 -3805 -628 1016 -5140 -8204 2953 -9647 862 -3120 6521 9955 5169 -6483 6789 -3465 7561 -8130 9471 -2368 3524 -7303 -7198 5883 9945 2219 5119 -5692 -6387 8432 -694 9998 -5374 8678 1014 -513 -9527 -6034 -159 1336 847 -3638 1291 -3985 -121 -1920 2551 -2561 -50 2021 5072 -6526 4719 7874 9357 4663 92 4475 8971 3705 2906 -1723 3703 7533 -3046 -5283 -2980 -2572 -1316 6861 8765 9532 -6778 56 -4453 3102 8136 8098 -9460 -1915 118 5613 1559 -5163 3486 916 9500 -6422 -4610 8471 7284 8297 -3253 987 5830 3702 5704 -7151 -8870 -5613 9710 9896 -6082 -7069 -49 -535 6034 -1914 -2438 6574 6171 7681 2187 -2270 -7483 -4328 8647 -7983 -750 -5964 -9513 -3466
import sys

input = sys.stdin.readline
sys.setrecursionlimit(1000000000)

def sumstr(str,start,end) :
    if(start == end) :
        return str[start]
    mid = int((start + end)/2)
    leftsum = sumstr(str, start, mid)
    rightsum = sumstr(str, mid+1, end)

    left = mid
    right = mid + 1
    midsum = 0
    maxmum = -float('INF')

    while True :
        if left < start or right > end :
            break;
        if str[left] > str[right] :
            midsum = midsum + str[left]
            maxmum = max(midsum,maxmum)
            left = left - 1
            if left < start :
                while right <= end :
                    midsum = midsum + str[right]
                    maxmum = max(midsum, maxmum)
                    right = right + 1
        else :
            midsum = midsum + str[right]
            maxmum = max(midsum, maxmum)
            right = right + 1
            if right > end :
                while left >= start :
                    midsum = midsum + str[left]
                    maxmum = max(midsum, maxmum)
                    left = left - 1

    return max(leftsum, rightsum, maxmum)

if __name__ =="__main__":
    n = int(input().strip())

    str = list(map(int,input().strip().split()))

    print(sumstr(str,0,len(str)-1))