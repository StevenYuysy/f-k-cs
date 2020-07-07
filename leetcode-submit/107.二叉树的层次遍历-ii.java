import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> currentLevelList = new ArrayList<Integer>();
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.remove();
                if (node != null) {
                    currentLevelList.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (currentLevelList.size() > 0) {
                list.add(0, currentLevelList);
            }
        }
        return list;
    }
}
// @lc code=end
