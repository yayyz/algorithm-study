class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) < 2: 
            return False 

        brackets_dict = {
            "}": "{",
            ")" : "(",
            "]": "["
        }

        stack = []  
        for char in s: 
            if char in brackets_dict: 
                if len(stack) == 0:
                    return False
                tmp = stack.pop()
                if tmp != brackets_dict[char]: 
                    return False 
            else: 
                stack.append(char)
        
        if len(stack) != 0: 
            return False 

        return True 