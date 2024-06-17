class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # any point where the buying price is better, update 
        minPrice = prices[0]
        # return value 
        maxProfit = 0
        
        for i in range(1, len(prices)): 
            price = prices[i]
            if minPrice > price: # buy 
                minPrice = price 
            elif minPrice < price and (price - minPrice) > maxProfit: # sell 
                maxProfit = price - minPrice
        
        return maxProfit

        