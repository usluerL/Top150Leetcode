package hm;


                            /*
Problem No: 290
Problem Title: Word Pattern
Difficulty: Easy
URL: https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150

Trick: Same logic with isomorphic strings question. two maps two checks.

                 */

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

     boolean wordPattern(String pattern, String s) {
         String[] sArr = s.split(" ");
         if (pattern.length() != sArr.length) return false;
         Map<Character,String> pMap = new HashMap<>(300);
         Map<String,Character> sMap = new HashMap<>(3000);

         for (int i = 0; i < pattern.length() ; i++) {
             char keyP = pattern.charAt(i);
             String keyS = sArr[i];
             if (pMap.containsKey(keyP) && !pMap.get(keyP).equals(keyS)){
                 return false;
             }
             if (sMap.containsKey(keyS) && sMap.get(keyS) != keyP) {
                 return false;
             }
             pMap.put(keyP,keyS);
             sMap.put(keyS,keyP);
         }
         return true;
    }

}
