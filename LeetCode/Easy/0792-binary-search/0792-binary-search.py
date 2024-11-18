class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low, high = 0, len(nums) - 1

        while low <= high: 
            pivot = (low + high) // 2
            if nums[pivot] == target: 
                return pivot 
            elif nums[pivot] > target: 
                high = pivot - 1
            else: 
                low = pivot + 1
        return -1
