/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if (needle.length() <= haystack.length()) {
            index = 0;
            while (index + needle.length() <= haystack.length()) {
                String c = haystack.substring(index, index + needle.length());
                if (c.equals(needle)) {
                    break;
                }
                index++;
            }
            if (index + needle.length() > haystack.length()) {
                index = -1;
            }
        }
        return index;
    }
}
// @lc code=end
