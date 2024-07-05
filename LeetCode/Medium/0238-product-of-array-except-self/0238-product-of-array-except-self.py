class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output, prefix, postfix = [], [], []
        size = len(nums)
        # create prefix     
        for i in range(size):
            if i == 0:
                prefix.append(nums[i])
            else: 
                prefix.append(prefix[i - 1] * nums[i])
            
        # create postfix 
        for i in range(size - 1, -1, -1):
            if i == size -1: 
                postfix.insert(0, nums[i])
            else: 
                postfix.insert(0, postfix[0] * nums[i])
        
        # create output 
        for i in range(size):
            pre = i - 1
            post = i + 1
            if pre < 0:
                output.append(postfix[post])
            elif post >= size: 
                output.append(prefix[pre])
            else: 
                output.append(prefix[pre] * postfix[post])
            
        return output 