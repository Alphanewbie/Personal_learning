## 백준 9251번 풀이

https://www.acmicpc.net/problem/9251

### 문제

*LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.*

*예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.*



### 입력

*첫째 줄과 둘째 줄에 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며, 최대 1000글자로 이루어져 있다.*

### 출력

*첫째 줄에 입력으로 주어진 두 문자열의 LCS의 길이를 출력한다.*

***



### 풀이

LCS문제 가장 대표적인 타입의 대표적인 다이나믹 프로그램 예제이다.

일단, 문장이 너무 기므로 일단 하나하나 짤라서 작은 부분으로 나눠서 고민하자



일단 예제 문자열을 가장 대표적인 LCS예제이자 위에서 언급된 것을 그대로 사용한다.

ACAYKP, CAPCAK 를 예제로 생각해보면 일단 이대로를 계산 할 수가 없으니 작은 문제로  쪼개서 생각해보자.

일단 가장 작은 각각의 앞의 글자 하나만 생각해 본다.

A

C

일단 둘을 비교해본 결과 다르다는 것을 알 수 있다.

그럼 거기에 문자열 1에 C를 추가한다.

A C

C

이제 같은 부분이 생겼다.

그럼 이제 문자열 2에 A를 추가해 보면

A C

C A

A는 같지만 교차 할 수 없다. 만약 일치하는 분자열의 시작이 A라면 버려지게 된다. 그럼 하나 찾을 때마다 다른 걸 전진하는 방식이 아니라 , 하나를 찾더라도 끝까지 일치하는 방식을 가야 된다.

그럼 생각을 바꿔서 같은 것이 나오면 바꾸는 것이 아니라 일치하는 것이 나올때까지 끝까지 검색하는 것으로 가면

|      | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- |
| C    | 0    | 0    | 1    | 1    | 1    | 1    |

C에서 하나 일치 하는 것을 찾을 수 있다

그럼 문자열2에 A를 추가하자

| 0    | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- |
| C    | 0    | 1    | 1    | 1    | 1    | 1    |
| A    | 1    |      |      |      |      |      |

일단 처음 시작하자마자 같은 부분을 만났다.

하지만, 이 다음에서 문제가 생기는데 바로 다음 문장인 C는 전 글자에서 만난 적이 있는 글자이다.

그럼, 숫자를 올려야 되느냐 하면 아니다이다.

A를 이미 만났다는 건 이미 C는 LCS에 포함되지 않는다가 전제이다. 그러니까 그냥 그대로 사용한다.

| 0    | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- |
| C    | 0    | 1    | 1    | 1    | 1    | 1    |
| A    | 1    | 1    |      |      |      |      |

이제 다음으로 다시 A를 만났다. 그럼 이제 고민해야 한다.

가능성이 3가지가 있는데

1. 첫번째 A를 만나고 이번에도 만난 것이다

2. 첫번째 A를 안 만나고 이게 처음으로 만난것이다.
3. 첫번째 글자인 C를 만나고 다음 글자인 A가 또 만난 것이다.

일단 1번은 고려할 이유가 없다. 최장 공통 부분 수열을 구하는 문제이다. 

즉, 공통되는 부분을 구하는 문제인데 이미 쓴 글자를 다시 쓸 수는 없다. 자연스럽게 아니게 된다.

2번도 고려할 이유가 없다. 최장 공통 부분 수열을 문제인데 100퍼센트 앞에 글자를 만나는게 더 길어 질텐데 건너뛰고서 다시 만날 이유가 없다. 그럼 첫번째 글자가 A가 아닌 다른 경우가 있을텐데 이 경우 이 자리의 숫자가 1이다.

3번은 C를 만나고 A가 만났을 경우다. 당연하지만 2번의 후자인 경우보다 길다. 같은 문자열을 가지고 비교하는 건데 A가 기느냐 CA가 더 기느냐는 고려할 여지가 없이 당연히 CA가 더 길다. 같은 문자열이다 보니 뒤도 똑같을테니

그렇다면 이제 +1하는 것은 같은 열이 아니라 C가 속해 있는 열에서 +1 해야한다. 그런데 이 이후보다 뒤에 있는 문자열은 고려할 이유가 없다. 당연히 이러면 역행이게 되니 고려할 이유가 없다. 그리고 당연하 비로 위도 아니다. 이미 만난거라면 같은 열이 될 수가 없으니

당연히 대각선 왼쪽 위를 고려해 봐야한다.

그럼 다음부터는  이미 2개를 만난 셈이니 나머지를 채워 나간다.

| 0    | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- |
| C    | 0    | 1    | 1    | 1    | 1    | 1    |
| A    | 1    | 1    | 2    | 2    | 2    | 2    |

다음으로 문자열 2에 P를 붙힌다

| 0    | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- |
| C    | 0    | 1    | 1    | 1    | 1    | 1    |
| A    | 1    | 1    | 2    | 2    | 2    | 2    |
| P    |      |      |      |      |      |      |

그럼 일단 P는A와 같지 않지만 위를 보면 현재 문자열을 AP라고 가정하면 이미 A를 한번 만난 적이 있다는 것을 알 수 있다. 그러니까 현재의 LCS는 1이다.

| 0    | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- |
| C    | 0    | 1    | 1    | 1    | 1    | 1    |
| A    | 1    | 1    | 2    | 2    | 2    | 2    |
| P    | 1    | 1    |      |      |      |      |

이제 위가 2다 즉 현재의 A(P) 문자열보다 위의 CA(P)문자열이 더 길 다는 것을 알 수 있다.

그러니 둘 중 더 큰 수를 입력해 준다

| 0    | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- |
| C    | 0    | 1    | 1    | 1    | 1    | 1    |
| A    | 1    | 1    | 2    | 2    | 2    | 2    |
| P    | 1    | 1    | 2    | 2    | 2    | 3    |

이런 방식으로 쭉 나아가면

| 0    | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- |
| C    | 0    | 0    | 1    | 1    | 1    | 1    |
| A    | 0    | 1    | 1    | 2    | 2    | 2    |
| P    | 0    | 1    | 1    | 2    | 2    | 2    |
| C    | 0    | 1    | 2    | 2    | 2    | 2    |
| A    | 0    | 1    | 2    | 3    | 3    | 3    |
| K    | 0    | 1    | 2    | 3    | 3    | 4    |

표는 이렇게 체워지게 된다.

즉,  최종적인 최장 공통 부분 수열의 길이는 4가 되게 된다.



### 점화식

1. str1[i]와 str[j]가 다를 경우

```pseudocode
dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
```

왼쪽이나 위쪽이나 둘 중 하나에서 더 큰 수를 집어 넣어준다.



2. str1[i]와 str[j]가 같은 경우

```pseudocode
dp[i][j] = dp[i - 1][j - 1] + 1;
```

왼쪽 대각선 위에서 +1를 해서 구해준다.



그리고 만약 첫번째 줄에서 같은걸 찾아낼 i-1이나 j-1을 할 경우 Out of Index 오류가 뜰 가능성이 있다.

고로 베이스 케이스로 각 문자열 앞에 0으로 초기화 시켜주는 것이 필요하다.

즉, 베이스 케이스는

```pseudocode
for i = 0 ... n
	L[i][0] <- 0
for j = 0 ... m
	L[0][j] <- 0
```



총 정리 하면 이런 형태가 된다.

```pseudocode
for i = 0 ... n
	L[i][0] <- 0
for j = 0 ... m
	L[0][j] <- 0
	
for i = 1 ... n
	for j = 1 ... m
		if(str1[i][j]!=str2[i][j])
			dp[i][j] <- max(dp[i - 1][j], dp[i][j - 1])
		else
			dp[i][j] <- dp[i - 1][j - 1] + 1;
```



참고로 이런 형태일때 표의 최종본

| 0    | 0    | A    | C    | A    | Y    | K    | P    |
| :--- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 0    | 0    | 0    | 0    | 0    | 0    | 0    | 0    |
| C    | 0    | 0    | 1    | 1    | 1    | 1    | 1    |
| A    | 0    | 1    | 1    | 2    | 2    | 2    | 2    |
| P    | 0    | 1    | 1    | 2    | 2    | 2    | 3    |
| C    | 0    | 1    | 2    | 2    | 2    | 2    | 3    |
| A    | 0    | 1    | 2    | 3    | 3    | 3    | 3    |
| K    | 0    | 1    | 2    | 3    | 3    | 4    | 4    |





### 전체 코드

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		sc.close();

		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		for (int i = 1; i <= str1.length(); i++) {
			char c1 = str1.charAt(i - 1);
			for (int j = 1; j <= str2.length(); j++) {
				char c2 = str2.charAt(j - 1);
				if (c1 == c2) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], 
                                        dp[i][j - 1]);
				}
			}
		}
		System.out.println(dp[str1.length()][str2.length()]);
	}
}

```

