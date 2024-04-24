class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var left: Int = 0
        var right: Int = nums.sum() - nums[0]
        var pivotIndex: Int = -1
        for (i in nums.indices) {
            // think about the corner cases
            if (i == 0 && left == right) {
                pivotIndex = i
                break
            }
            // and general cases
            if (left == right) {
                pivotIndex = i
                break
            }
            left += nums[i]

            var subtract = when {
                i + 1 >= nums.size -> right
                else -> nums[i + 1]
            }
            right -= subtract
        }

        return pivotIndex
    }
}