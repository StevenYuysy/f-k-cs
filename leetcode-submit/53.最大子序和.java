/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> cResult = new ArrayList<>(result);
            result.add(nums[i]);
            for (int j = 1; j <= i; j++) {
                int index = cResult.size() - j;
                int num = cResult.get(index);
                result.add(num + nums[i]);
            }
        }
        return Collections.max(result);
    }
}
// @lc code=end
