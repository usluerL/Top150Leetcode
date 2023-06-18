package twopointers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWoRepChars {


                            /*
Problem No: 3
Problem Title: Longest Substring Without Repeating Characters
Difficulty: Medium
URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=study-plan-v2&envId=top-interview-150

Trick: Two Pointer + Map  -> left position -> max(left, key position).

                 */
    int lengthOfLongestSubstring(String s) {
        int maxL = 0;
        int len = s.length();
        if (len < 2) return len;
        Map<Character, Integer> charMap = new HashMap<>();
        int first = 0;
        int second = 0;
        while (second < len) {
            if (charMap.containsKey(s.charAt(second))) {
               first = Math.max(charMap.get(s.charAt(second)),first);
            }
            int dif = second - first + 1;
            maxL = Math.max(maxL, dif);
            charMap.put(s.charAt(second), second + 1);
            second++;
        }
        return maxL;
    }

}
