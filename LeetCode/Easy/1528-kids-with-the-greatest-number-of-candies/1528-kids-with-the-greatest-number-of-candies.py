class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        max_num = 0
        n = len(candies)
        ret = []
        for i in range(n):
            max_num = max(max_num, candies[i])
            candies[i] += extraCandies
        
        for i in range(n):
            if candies[i] >= max_num:
                ret.append(True)
            else: 
                ret.append(False)

        return ret
        

