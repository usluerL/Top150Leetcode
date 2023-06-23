package hm;


                            /*
Problem No: 205
Problem Title:  Isomorphic Strings

Difficulty: Easy
URL: https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150

Trick: two map -> a to b, b to a same logic. Fixed the size!!! -> ascii 256.

                 */


import java.util.*;

public class IsoMorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap<>(128);
        Map<Character,Character> tMap = new HashMap<>(128);

        for (int i = 0; i <s.length() ; i++) {
            char keyS = s.charAt(i);
            char keyT = t.charAt(i);
            if (sMap.containsKey(keyS) && sMap.get(keyS)!= keyT){
                return false;
            }
            if (tMap.containsKey(keyT) && tMap.get(keyT)!= keyS){
                return false;
            }
            sMap.put(keyS,keyT);
            tMap.put(keyT,keyS);
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "ff";
        String t = "ab";

        IsoMorphicStrings isoM =  new IsoMorphicStrings();
        System.out.println(isoM.isIsomorphic(s, t));

    }

}
