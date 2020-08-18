import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=299 lang=java
 *
 * [299] 猜数字游戏
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        int aNum = 0;
        int bNum = 0;
        HashMap<Character, Integer> secretMap = new HashMap<>();
        HashMap<Character, Integer> guessMap = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            Character secretChar = secret.charAt(i);
            Character guessChar = guess.charAt(i);
            if (secretChar.equals(guessChar)) {
                aNum++;
            } else {
                int currentSecretCharCount = secretMap.containsKey(secretChar) ? secretMap.get(secretChar) + 1 : 1;
                int currentGuessCharCount = guessMap.containsKey(guessChar) ? guessMap.get(guessChar) + 1 : 1;
                secretMap.put(secretChar, currentSecretCharCount);
                guessMap.put(guessChar, currentGuessCharCount);
            }
        }
        for (HashMap.Entry<Character, Integer> secretEntry : secretMap.entrySet()) {
            if (guessMap.containsKey(secretEntry.getKey())) {
                bNum += Math.min(guessMap.get(secretEntry.getKey()), secretEntry.getValue());
            }
        }
        return aNum + "A" + bNum + "B";
    }
}
// @lc code=end
