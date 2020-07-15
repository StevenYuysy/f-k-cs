/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode indexA = headA;
        ListNode indexB = headB;
        while (indexA != indexB) {
            indexA = indexA != null ? indexA.next : headB;
            indexB = indexB != null ? indexB.next : headA;
        }
        return indexA;
    }
}
// @lc code=end
