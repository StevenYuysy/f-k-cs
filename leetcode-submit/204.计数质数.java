/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (checkIsPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean checkIsPrime(int n) {
        boolean isPrime = true;
        if (n == 2 ) {
            isPrime = true;
        } else if (n % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i+=2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
// @lc code=end

