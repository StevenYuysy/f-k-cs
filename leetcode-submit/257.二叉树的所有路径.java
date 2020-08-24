/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        return btpHelper(root, "");
    }

    private List<String> btpHelper(TreeNode root, String prev) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            prev += root.val;
            list.add(prev);
        }
        prev += root.val + "->";
        if (root.left != null) {
            list.addAll(btpHelper(root.left, prev));
        }
        if (root.right != null) {
            list.addAll(btpHelper(root.right, prev));
        }
        return list;
    }
}
// @lc code=end
