import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return true;
        }
        queue.add(root);
        int count = 0;
        int nextCount = 1;
        ArrayList<Integer> compareList = new ArrayList<Integer>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (count < nextCount) {
                compareList.add(node != null ? node.val : null);
                count++;
            } else {
                if (compareList.size() != nextCount) {
                    return false;
                }
                boolean isSymmetricList = checkIsSymmetricList(compareList);
                if (isSymmetricList == false) {
                    return false;
                }
                compareList.removeAll(Collections.singleton(null));
                nextCount = compareList.size() * 2;
                compareList.clear();
                compareList.add(node != null ? node.val : null);
                count = 1;
            }
            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        if (!compareList.isEmpty()) {
            if (compareList.size() != nextCount) {
                return false;
            }
            boolean isSymmetricList = checkIsSymmetricList(compareList);
            if (isSymmetricList == false) {
                return false;
            }
        }
        return true;
    }

    private boolean checkIsSymmetricList(ArrayList<Integer> list) {
        boolean isSymmetricList = true;
        int length = list.size();
        for (int i = 0; i < length / 2; i++) {
            int symmetricIndex = length - 1 - i;
            if (list.get(i) != null) {
                if (!list.get(i).equals(list.get(symmetricIndex))) {
                    isSymmetricList = false;
                    break;
                }
            } else if (list.get(i) != list.get(symmetricIndex)) {
                isSymmetricList = false;
                break;
            }
        }
        return isSymmetricList;
    }
}
// @lc code=end
