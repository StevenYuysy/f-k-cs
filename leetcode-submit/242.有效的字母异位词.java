import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagramS = true;
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 0);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (!map.containsKey(c)) {
                isAnagramS = false;
                break;
            } else {
                Integer times = map.get(c);
                if (times < 0) {
                    isAnagramS = false;
                    break;
                }
                map.put(c, times - 1);
            }
        }
        return isAnagramS;
    }
}
// @lc code=end
