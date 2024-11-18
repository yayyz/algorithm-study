class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # create dict
        map = {}
        for char in s: 
            if char in map: 
                map[char] += 1
            else:
                map[char] = 1
        
        # compare with t 
        for char in t:
            if char in map: 
                map[char] -= 1
                if map[char] < 0:
                    return False
            else: 
                return False
        
        return all(value == 0 for value in map.values())                
