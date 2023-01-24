class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        numMap = dict()
        for num in nums: 
            numMap[num] = numMap.get(num,0) + 1
        
        ret = dict(sorted(numMap.items(), key=lambda x: x[1], reverse=True))
        return list(ret)[0:k]