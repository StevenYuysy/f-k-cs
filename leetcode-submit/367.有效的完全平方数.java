/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        boolean isSquare = false;
        int lo = 0;
        int hi = num / 2;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long midSquare = mid * mid;
            if (midSquare == num) {
                isSquare = true;
                break;
            } else if (midSquare > num) {
                hi = (int) mid - 1;
            } else {
                lo = (int) mid + 1;
            }
        }
        return isSquare;
    }
}
// @lc code=end
