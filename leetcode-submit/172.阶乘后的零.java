/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        long powerOfFive = 5;
        while (n >= powerOfFive) {
            count += (n / powerOfFive);
            powerOfFive *= 5;
        }

        return count;
    }
}
// @lc code=end
