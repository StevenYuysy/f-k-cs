/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode dummyNode = new ListNode(head.val);
        ListNode tempNode = dummyNode;
        while (head != null) {
            if (tempNode.val != head.val) {
                tempNode.next = head;
                tempNode = tempNode.next;
            }
            head = head.next;
        }
        tempNode.next = null;
        return dummyNode;
    }
}
// @lc code=end
