class Solution {
    fun runningSum(nums: IntArray): IntArray {
        // output array that stores calculated results
        val output: IntArray = IntArray(nums.size)

        for (i in nums.indices) {
            output[i] = nums.slice(0..i).sum()
        }

        return output
    }
}