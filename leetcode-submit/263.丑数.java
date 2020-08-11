/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */

// @lc code=start
class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        if (num % 5 == 0) {
            return isUgly(num / 5);
        }
        if (num % 3 == 0) {
            return isUgly(num / 3);
        }
        if (num % 2 == 0) {
            return isUgly(num / 2);
        }
        return false;
    }
}
// @lc code=end

