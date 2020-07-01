/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean startCount = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (startCount && s.charAt(i) == ' ') {
                break;
            } else if (s.charAt(i) != ' ') {
                startCount = true;
                length++;
            }
        }
        return length;
    }
}
// @lc code=end
