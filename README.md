# Personal-Study

# 백준 2108번 통계학
· 입력값을 담을 배열과 최빈값을 위한 같은 숫자를 count하는 배열을 따로 만들 필요가 없다고 생각했다. 즉, 입력값이 -4000 ~ 4000 사이에 존재해야 하기 때문에 입력값을 받을 배열과 count할 배열을 같이 만든다.

· 이처럼 배열의 크기를 지정하면 arr[8001]이 나오는데 입력한 값이 4라면 arr[i + 4000]++ 하여 4라는 값이 총 몇 개가 있는지 count도 하고 해당 4의 값이 몇 개 존재하는지도 알 수 있다. 이를 통해 바로 합계 계산도 한다.

· 중간값과 최빈값을 출력하고 최댓값과 최솟값의 차이를 출력하기 위해 8001번의 반복문을 돌면서 값이 존재할 때만 기능을 수행한다.

· 중간값 같은 경우는 입력값에 따라 count한 배열을 이용해서 만약 총 5개의 값을 입력하였을 때 [4,4,5,7,9]를 입력했을 때 arr[4004]의 값은 2의 값을 가질 것이고 arr[4005], arr[4007], arr[4009]는 각각 1의 값을 가질 것이다. 그렇다면 만약 빈도수의 합이 총 입력값의 절반 + 1과 같다면 이 값은 중간값일 것이다.

· 최빈값 같은 경우는 먼저 각 count배열의 값들을 통해 서로 비교하고 배열 값이 클 경우 그 배열 인덱스에 -4000을 해준 값이 결과 값이 될 것이고 만약 count 배열 값이 같을 경우 각 배열 인덱스 값을 비교했을 때 큰 값을 선택한다. 하지만 두 번째로 작은 값이라고 했으므로 처음 swap이 일어났다면 boolean 함수를 이용하여 다음에 또 swap 되는 것을 막는다.
