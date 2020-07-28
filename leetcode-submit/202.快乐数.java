/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else if (n < 7) {
            return false;
        }
        int result = 0;
        while (n != 0) {
            int i = n % 10;
            result = result + (int)Math.pow(i, 2);
            n = n / 10;
        }
        return isHappy(result);
    }
}
// @lc code=end

