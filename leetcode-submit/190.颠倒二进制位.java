/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String bitN = tenToBit(n);
        long r = 0;
        for (int i = 0; i < bitN.length(); i++) {
            int currentInt = Character.getNumericValue(bitN.charAt(i));
            long tenInt = currentInt * (long) Math.pow(2, i);
            r += tenInt;
        }
        return (int) r;
    }

    private String tenToBit(int n) {
        String r = "";
        boolean flag = true;
        if (n < 0) {
            n = (-n) - 1;
            flag = false;
        }
        while (n != 0) {
            int i = (n % 2);
            r = String.valueOf(i) + r;
            n /= 2;
        }
        while (r.length() < 32) {
            r = "0" + r;
        }
        if (!flag) {
            String newR = "";
            for (int i = 0; i < r.length(); i++) {
                newR += r.charAt(i) == '1' ? '0' : '1';
            }
            System.out.println("newR " + newR);
            return newR;
        }
        return r;
    }

}
// @lc code=end
