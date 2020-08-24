/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] c = s.toCharArray();
        while (i < j) {
            char iChar = c[i];
            char jChar = c[j];
            if (!isVowels(iChar)) {
                i++;
            } else {
                if (!isVowels(jChar)) {
                    j--;
                } else {
                    swap(c, i, j);
                    i++;
                    j--;
                }
            }
        }
        return new String(c);
    }

    private Boolean isVowels(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }

    private void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
// @lc code=end
