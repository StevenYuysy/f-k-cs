/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        if (target > nums[high]) {
            return nums.length;
        } else if (target < nums[low]) {
            return 0;
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                break;
            }
        }
        if (nums[mid] == target) {
            return mid;
        } else {
            return low;
        }
    }
}
// @lc code=end
