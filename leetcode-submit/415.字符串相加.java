/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        String result = "";
        int maxLength = num1.length() > num2.length() ? num1.length() : num2.length();
        int num1Offset = maxLength - num1.length();
        int num2Offset = maxLength - num2.length();
        boolean flag = false;
        for (int i = maxLength - 1; i >= 0; i--) {
            char char1 = '0';
            char char2 = '0';
            if (i - num1Offset >= 0) {
                char1 = num1.charAt(i - num1Offset);
            }
            if (i - num2Offset >= 0) {
                char2 = num2.charAt(i - num2Offset);
            }
            int int1 = char1 - '0';
            int int2 = char2 - '0';
            int add = int1 + int2;
            if (flag) {
                add = add + 1;
                flag = false;
            }
            if (add >= 10) {
                flag = true;
                add = add % 10;
            }
            result = add + result;
        }
        if (flag) {
            result = "1" + result;
        }
        return result;
    }
}
// @lc code=end
