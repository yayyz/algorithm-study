class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        n = max(len(word1), len(word2))
        ret = ""

        for i in range(n):
            if len(word1) > i: 
                ret += word1[i]
            if len(word2) > i:
                ret += word2[i]

        return ret