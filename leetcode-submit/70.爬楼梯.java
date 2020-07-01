import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, result);
        return result;
    }

}
// @lc code=end
