import sys
input = sys.stdin.readline

if __name__ == "__main__" :

    T = int(input().strip())

    for i in range(T) :
        n = int(input().strip())

        sticker = [[0]*n for i in range(2)]

        dp = [[0] * n for i in range(2)]

        for i in range(2) :
            sticker[i]= list(map(int,input().strip().split()));

        for i in range(2) :
            dp[i][0] = sticker[i][0]

        dp[0][1] = max(0, sticker[1][0]) + sticker[0][1]
        dp[1][1] = max(0, sticker[0][0]) + sticker[1][1]

        for i in range(2,n) :
            dp[0][i] = max(dp[0][i - 1], dp[1][i - 1] + sticker[0][i], dp[1][i - 2] + sticker[0][i]);
            dp[1][i] = max(dp[1][i - 1], dp[0][i - 1] + sticker[1][i], dp[0][i - 2] + sticker[1][i]);

        print(max(dp[0][n-1],dp[1][n-1]))