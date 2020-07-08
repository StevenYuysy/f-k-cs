/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        boolean isInit = false;
        int prevVal = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (!stack.isEmpty() || currentNode != null) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            if (isInit == false) {
                isInit = true;
                prevVal = currentNode.val;
            } else if (prevVal >= currentNode.val) {
                return false;
            }
            prevVal = currentNode.val;
            currentNode = currentNode.right;
        }
        return true;
    }
}
// @lc code=end
