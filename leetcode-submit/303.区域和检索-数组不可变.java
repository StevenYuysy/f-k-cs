/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 */

// @lc code=start
class NumArray {
    int[] sumList;

    public NumArray(int[] nums) {
        sumList = new int[nums.length + 1];
        sumList[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sumList[i + 1] = sumList[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sumList[j + 1] - sumList[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
 */
// @lc code=end
