class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        if k > len(nums):
            return 0
        if len(nums) == 1:
            return nums[0] / k

        curr_sum = sum(nums[:k])
        max_sum = curr_sum    

        for i in range(k, len(nums)):
            curr_sum += nums[i] - nums[i-k]
            max_sum = max(max_sum, curr_sum)

        return max_sum / k


        
