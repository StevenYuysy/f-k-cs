/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int lastSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lastSum = Math.max(lastSum, 0) + nums[i];
            if (lastSum > currentSum) {
                currentSum = lastSum;
            }
        }
        return currentSum;
    }
}
// @lc code=end
