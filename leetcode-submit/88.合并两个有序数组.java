/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;

        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0)
            return;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (index1 >= m + index2) {
                nums1[index1] = nums2[index2];
                index1++;
                index2++;
            } else if (nums2[index2] < nums1[index1]) {
                for (int i = nums1.length - 1; i > index1; i--) {
                    nums1[i] = nums1[i - 1];
                }
                nums1[index1] = nums2[index2];
                index2++;
            } else {
                index1++;
            }
        }
    }
}
// @lc code=end
