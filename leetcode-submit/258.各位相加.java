/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        int count = 0;
        while (num > 0) {
            count += num % 10;
            num /= 10;
        }
        if (count < 10) {
            return count;
        } else {
            return addDigits(count);
        }
    }
}
// @lc code=end

