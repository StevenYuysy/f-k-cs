/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode dummyNode = head;
        while (dummyNode != null) {
            list.add(dummyNode.val);
            dummyNode = dummyNode.next;
        }
        boolean isPalindromeListNode = true;
        for (int i = 0; i < list.size() / 2; i++) {
            int lastIndex = list.size() - 1 - i;
            if (!list.get(i).equals(list.get(lastIndex))) {
                isPalindromeListNode = false;
                break;
            }
        }
        return isPalindromeListNode;
    }
}
// @lc code=end

