/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode parent = head;
        ListNode next = head;
        while (next != null) {
            if (next.val == val) {
                if (parent == next) {
                    head = next.next;
                    parent = head;
                } else {
                    parent.next = next.next;
                }
            } else {
                parent = next;
            }
            next = next.next;
        }
        return head;
    }
}
// @lc code=end

