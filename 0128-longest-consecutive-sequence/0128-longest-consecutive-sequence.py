class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0: 
            return 0
        
        
        numSet = set(nums)
        sortedList = sorted(numSet)
        
        streak = 1
        lastNum = sortedList[0]
        result = 1
        
        for i in range(1, len(sortedList)):
            if sortedList[i] == lastNum + 1:
                streak += 1
            else:
                streak = 1
            
            result = max(result, streak)
            lastNum = sortedList[i]
        
        return result 
                
        
            
        