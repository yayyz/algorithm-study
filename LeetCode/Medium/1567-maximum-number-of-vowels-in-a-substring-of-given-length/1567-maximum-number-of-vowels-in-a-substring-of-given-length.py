class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a', 'e', 'i','o','u', 'A', 'E', 'I', 'O', 'U'}
        curr_count = 0
         # count the current window's vowel count 
        for char in s[:k]:
            if char in vowels: 
                curr_count += 1

        max_count = curr_count 

        # now do the rest 
        for i in range(k,len(s)):
            
            if s[i-k] in vowels: 
                curr_count -= 1
            if s[i] in vowels:
                curr_count += 1
            max_count = max(curr_count, max_count)
        
        return max_count 
