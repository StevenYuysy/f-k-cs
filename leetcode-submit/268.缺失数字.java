/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int missingNum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                missingNum = i;
                break;
            }
            if (i == nums.length - 1) {
                missingNum = nums.length;
            }
        }
        return missingNum;
    }
}
// @lc code=end

