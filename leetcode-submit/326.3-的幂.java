/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        boolean isPower = true;
        while (n != 1) {
            if (n % 3 != 0) {
                isPower = false;
                break;
            }
            n = n / 3;
        }
        return isPower;
    }
}
// @lc code=end
