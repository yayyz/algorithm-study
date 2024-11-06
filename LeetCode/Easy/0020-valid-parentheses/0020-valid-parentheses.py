class Solution:
    def isValid(self, s: str) -> bool:
        brackets_dict = {
            "}": "{",
            ")" : "(",
            "]": "["
        }

        stack = []  
        for char in s: 
            if char in brackets_dict: 
                if not stack or stack.pop() != brackets_dict[char]:
                    return False
            else: 
                stack.append(char)
        
        return not stack