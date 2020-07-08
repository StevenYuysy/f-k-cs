import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ArrayList<ListNode> list = new ArrayList();
        boolean isCycle = false;
        while (head.next != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == head) {
                    isCycle = true;
                    break;
                }
            }
            if (isCycle) {
                break;
            }
            list.add(head);
            head = head.next;
        }
        return isCycle;
    }
}
// @lc code=end
