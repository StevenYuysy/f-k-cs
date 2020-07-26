import java.util.List;

/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums, 0, nums.length - 1);
    }

    private TreeNode insert (int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int middleIndex = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[middleIndex]);
        root.left = insert(nums, lo, middleIndex - 1);
        root.right = insert(nums, middleIndex + 1, hi);
        return root;
    }
}
// @lc code=end
