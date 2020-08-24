/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strList = str.split(" ");
        if (strList.length != pattern.length()) {
            return false;
        }
        boolean isMatch = true;
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> strMap = new HashMap<>();
        for (int i = 0; i < strList.length; i++) {
            if (patternMap.containsKey(pattern.charAt(i))) {
                if (!patternMap.get(pattern.charAt(i)).equals(strList[i])) {
                    isMatch = false;
                    break;
                }
            } else {
                patternMap.put(pattern.charAt(i), strList[i]);
            }
            if (strMap.containsKey(strList[i])) {
                if (!strMap.get(strList[i]).equals(pattern.charAt(i))) {
                    isMatch = false;
                    break;
                }
            } else {
                strMap.put(strList[i], pattern.charAt(i));
            }
        }
        return isMatch;
    }
}
// @lc code=end

