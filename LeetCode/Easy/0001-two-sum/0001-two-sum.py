class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = {}
        ret = []

        for i, num in enumerate(nums):
            num_map[num] = i

        print(num_map)
        for i, num in enumerate(nums):
            tmp = target - num
            if tmp in num_map and num_map[tmp] != i:
                ret.append(i)
                ret.append(num_map[tmp])
                break

        return ret