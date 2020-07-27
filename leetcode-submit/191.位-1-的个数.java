/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int loopTime = 32;
        int times = 0;
        while (times < loopTime) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
            times++;
        }
        return count;
    }
}
// @lc code=end

