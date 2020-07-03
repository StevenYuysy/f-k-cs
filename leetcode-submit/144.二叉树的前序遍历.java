/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rootList = new ArrayList<Integer>();
        List<Integer> leftList = new ArrayList<Integer>();
        List<Integer> rightList = new ArrayList<Integer>();
        if (root != null) {
            rootList.add(root.val);
        } else {
            return rootList;
        }
        if (root.left != null) {
            leftList.addAll(preorderTraversal(root.left));
        }
        if (root.right != null) {
            rightList.addAll(preorderTraversal(root.right));
        }
        rootList.addAll(leftList);
        rootList.addAll(rightList);
        return rootList;
    }
}
// @lc code=end
