/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        boolean isPalindromeString = true;
        String regex = "[a-zA-Z0-9]";
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            String f = String.valueOf(Character.toLowerCase(s.charAt(i)));
            String l = String.valueOf(Character.toLowerCase(s.charAt(j)));
            if (!f.matches(regex)) {
                i++;
                continue;
            }
            if (!l.matches(regex)) {
                j--;
                continue;
            }
            if (!f.equals(l)) {
                isPalindromeString = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindromeString;
    }
}
// @lc code=end
