class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        ret = 0
        while left < right: 
            volume = (right - left) * min(height[left], height[right])
            ret = max(ret, volume)

            if height[left] < height[right]:
                left += 1
            else: 
                right -= 1
        return ret