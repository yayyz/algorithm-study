class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # left : finds zero 
        # right: finds non-zero 
        left = 0
        for right in range(len(nums)):
            if nums[right]: # non-zero 
                nums[left], nums[right] = nums[right], nums[left]
                left += 1



        
            

                
        