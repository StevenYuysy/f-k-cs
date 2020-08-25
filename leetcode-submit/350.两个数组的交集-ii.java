import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            int count = map1.containsKey(num) ? map1.get(num) + 1 : 1;
            map1.put(num, count);
        }
        for (int num : nums2) {
            if (map1.containsKey(num)) {
                list.add(num);
                int count = map1.get(num);
                if (count > 1) {
                    map1.put(num, count - 1);
                } else {
                    map1.remove(num);
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();

    }
}
// @lc code=end
