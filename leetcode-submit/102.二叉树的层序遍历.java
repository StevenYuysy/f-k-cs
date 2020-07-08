import java.awt.List;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        int count = 1;
        int nextCount = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            tempList.add(node != null ? node.val : null);
            if (count < nextCount) {
                count++;
            } else {
                List<Integer> listToAdd = new ArrayList<>(tempList);
                listToAdd.removeAll(Collections.singleton(null));
                if (listToAdd.size() > 0) {
                    list.add(listToAdd);
                }
                tempList.clear();
                count = 1;
                nextCount = listToAdd.size() * 2;
            }
            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return list;
    }
}
// @lc code=end
