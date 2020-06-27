/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        return this.explain(countAndSay(n - 1));
    }

    public String explain(String s) {
        String result = "";
        char lastC = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != lastC) {
                result += String.valueOf(count) + lastC;
                lastC = c;
                count = 1;
            } else {
                count += 1;
            }
        }
        result += String.valueOf(count) + lastC;
        return result;
    }
}
// @lc code=end
