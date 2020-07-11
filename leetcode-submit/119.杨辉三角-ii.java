/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex == 0) {
            return list;
        }
        List<Integer> lastList = getRow(rowIndex - 1);
        for (int i = 1; i < lastList.size(); i++) {
            list.add(lastList.get(i - 1) + lastList.get(i));
        }
        list.add(1);
        return list;
    }
}
// @lc code=end
