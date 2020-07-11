/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return list;
        }
        List<Integer> initList = new ArrayList<>();
        initList.add(1);
        list.add(initList);
        for (int i = 1; i < numRows; i++) {
            list.add(getNext(list.get(i - 1)));
        }
        return list;
    }

    public List<Integer> getNext(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        for (int i = 1; i < list.size(); i++) {
            newList.add(list.get(i - 1) + list.get(i));
        }
        newList.add(1);
        return newList;
    }
}
// @lc code=end
