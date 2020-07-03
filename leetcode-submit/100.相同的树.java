import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> pList = this.getTreeList(p);
        ArrayList<Integer> qList = this.getTreeList(q);
        if (pList.size() != qList.size()) {
            return false;
        }
        boolean isSame = true;
        for (int i = 0; i < pList.size(); i++) {
            if (pList.get(i) != null) {
                if (!pList.get(i).equals(qList.get(i))) {
                    isSame = false;
                    break;
                }
            } else if (qList.get(i) != null) {
                isSame = false;
                break;
            }
        }
        return isSame;
    }

    public ArrayList<Integer> getTreeList(TreeNode p) {
        ArrayList<Integer> rootList = new ArrayList();
        ArrayList<Integer> leftList = new ArrayList();
        ArrayList<Integer> rightList = new ArrayList();
        if (p != null) {
            rootList.add(p.val);
            if (p.left != null) {
                leftList.addAll(getTreeList(p.left));
            } else {
                leftList.add(null);
            }
            if (p.right != null) {
                rightList.addAll(getTreeList(p.right));
            } else {
                rightList.add(null);
            }
        } else {
            rootList.add(null);
        }
        rootList.addAll(leftList);
        rootList.addAll(rightList);
        return rootList;
    }
}
// @lc code=end
