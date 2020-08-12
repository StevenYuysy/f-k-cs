/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int mid = lo + (hi - lo) / 2;
        while (lo <= hi) {
            if (isBadVersion(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
            mid = lo + (hi - lo) / 2;
        }
        return mid;
    }
}
// @lc code=end

