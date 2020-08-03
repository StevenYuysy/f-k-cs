/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        boolean isDuplicate = false;
        for (int num: nums) {
            if (map.containsKey(num)) {
                isDuplicate = true;
                break;
            } else {
                map.put(num, true);
            }
        }
        return isDuplicate;
    }
}
// @lc code=end

