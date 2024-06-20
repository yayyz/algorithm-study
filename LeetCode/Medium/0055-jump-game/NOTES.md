## initial solution: 

```python
class Solution:
    def canJump(self, nums: List[int]) -> bool:
        def canJumpFromPosition(position, nums):![](https://)
            # base case: 현재 위치가 배열의 마지막 인덱스인 경우 True 반환
            if position == len(nums) - 1:
                return True
            
            # 현재 위치에서 갈 수 있는 가장 먼 위치 계산 (length를 넘어가지 않도록)
            furthestJump = min(position + nums[position], len(nums) - 1)
            # 다음위치로 점프 가능한 범위를 recursive 하게 확인 
            for nextPosition in range(position + 1, furthestJump + 1):
                if canJumpFromPosition(nextPosition, nums):
                    return True
            
            # 끝까지 도달하지 못한 경우 False 반환
            return False
        
        # 초기 위치 0에서 시작
        return canJumpFromPosition(0, nums)
```
이렇게 풀었는데, 역시 재귀함수를 사용했으나! DP나 Greedy Algorithm사용이 없어서 시간초과 떴다..

## Greedy Algorithm: 
각 위치에서 가장 최대로 갈수있는 거리로 Jump!
max_reach가 len(nums) 와 같으면 True, 아니라면 False 

```python
 def canJump(self, nums: List[int]) -> bool:
        max_reach = 0
        for i, jump in enumerate(nums):
            if i > max_reach: 
                return False
            max_reach = max(max_reach, i + jump)
        return True 
```

## DP:
```python
def canJump(self, nums: List[int]) -> bool:
        n = len(nums)
        dp = [False] * n
        dp[0] = True  # 첫 번째 위치는 항상 도달 가능

        for i in range(1, n):
            for j in range(i):
                if dp[j] and j + nums[j] >= i:
                    dp[i] = True
                    break

        return dp[-1]
```
- 각 위치에서 앞으로 점프할수있는지 확인 하는 방식 
- dp 라는 배열에 해당 Index에 도달했는지 기록, 모든 연산이 끝난 후에 마지막 index를 Return
