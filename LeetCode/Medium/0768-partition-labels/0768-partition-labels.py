class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        lastIndex = {} # 각 char의 lastindex를 저장하는 dict 
        ret = []
        size, end = 0,0

        for i, char in enumerate(s):
            lastIndex[char] = i
        
        for i, char in enumerate(s):
            size += 1
            end = max(end, lastIndex[char])

            if i == end:
                ret.append(size)
                size = 0
        
        return ret