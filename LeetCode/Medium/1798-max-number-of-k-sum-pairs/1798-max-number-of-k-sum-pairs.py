class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        # create dictionary 
        occurences = {}
        for num in nums:
            if num in occurences:
                occurences[num] += 1
            else:
                occurences[num] = 1

        count = 0
        # do the operation
        for num in nums:
            complement = k - num
            if occurences.get(complement, 0) > 0 and occurences.get(num,0) > 0:
                # 같은 경우 
                if num == complement and occurences[num] < 2:
                    continue
                occurences[complement] -= 1
                occurences[num] -= 1
                count += 1
            
        return count 
            

            
            

                
