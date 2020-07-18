import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            intList.add(0, 1);
            int length = intList.size();
            for (int j = 1; j < length - 1; j++) {
                Integer diff = intList.get(j) + intList.get(j + 1);
                intList.set(j, diff);
            }
        }
        return intList;
    }
}
// @lc code=end
