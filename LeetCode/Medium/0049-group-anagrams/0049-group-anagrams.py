class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # create a dictionary for anagrams
        # sort word and check if that word exist in a set (anagram dictionary)
        # if yes, add, if not pass 

        anagrams = dict()
        for str in strs: 
            word = "".join(sorted(str))
            # if empty 
            if not anagrams: 
                anagrams[word] = [str]
            else: 
                if word in anagrams: 
                    anagrams[word].append(str)
                else: 
                    anagrams[word] = [str]
        
        return anagrams.values()
