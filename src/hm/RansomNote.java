package hm;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

                                /*
Problem No: 383
Problem Title: Ransom Note
Difficulty: Easy
URL: https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150

Trick: Map --- if map contains -> 0 return false;

                 */


    boolean canConstruct(String ransomNote, String magazine) {

        int len = magazine.length();
        Map<Character, Integer> magazineMap = new HashMap<>(26);
        for (int i = 0; i < len; i++) {
            char key = magazine.charAt(i);
            if (magazineMap.containsKey(key)) {
                magazineMap.put(key, magazineMap.get(key) + 1);
            } else {
                magazineMap.put(key, 1);
            }
        }
        int lenR = ransomNote.length();
        for (int j = 0; j < lenR; j++) {

            char key = ransomNote.charAt(j);
            if (!magazineMap.containsKey(key) || magazineMap.get(key) == 0) return false;

            if (magazineMap.containsKey(key)) {
                magazineMap.put(key, magazineMap.get(key) - 1);
            }

        }
        return true;
    }


    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        String ransom = "aa";
        String magazine = "a";
        System.out.println(ransomNote.canConstruct(ransom, magazine));
    }
}
