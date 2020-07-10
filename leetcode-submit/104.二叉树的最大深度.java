/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return 0;
        }
        queue.add(root);
        int count = 0;
        int nextCount = 1;
        int level = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (count < nextCount) {
                count++;
            } else {
                nextCount = count * 2;
                count = 1;
                level++;
            }
            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return level;
    }
}
// @lc code=end
