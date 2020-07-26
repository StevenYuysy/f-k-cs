/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int power = 31;
        while (power >= 0) {
            res += (n & 1) << power;
            power--;
            n >>= 1;
        }
        return res;
    }

}
// @lc code=end
