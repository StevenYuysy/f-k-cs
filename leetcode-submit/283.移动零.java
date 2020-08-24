/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && i != nums.length - 1) {
                int nextIndex = i + 1;
                while (nums[nextIndex] == 0 && nextIndex < nums.length - 1) {
                    nextIndex++;
                }
                int temp = nums[i];
                nums[i] = nums[nextIndex];
                nums[nextIndex] = temp;
                if (nextIndex == nums.length - 1) {
                    break;
                }
            }
        }
    }
}
// @lc code=end

