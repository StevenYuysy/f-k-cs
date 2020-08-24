import java.util.ArrayList;

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

    public List<String> btpHelper(TreeNode root, String prev) {
        ArrayList<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        String next = prev.equals("") ? String.valueOf(root.val) : prev + "->" + root.val;
        if (root.left == null && root.right == null) {
            // base case
            list.add(next);
        }
        if (root.left != null) {
            list.addAll(btpHelper(root.left, next));
        }

        if (root.right != null) {
            list.addAll(btpHelper(root.right, next));
        }

        return list;
    }
}
// @lc code=end
