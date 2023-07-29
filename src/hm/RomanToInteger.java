package hm;

import java.util.Map;

                                /*
Problem No: 13
Problem Title:  RomanToInteger

Difficulty: Easy
URL: https://leetcode.com/problems/roman-to-integer/

Trick: c < next -> -c  //find a general case.

                 */


public class RomanToInteger {



    public int romanToInt(String s) {

        Map<Character, Integer> hm = Map.of('I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i);
            char next = s.charAt(i + 1);
            if (hm.get(c) <hm.get(next)) {
                sum -= hm.get(c);
            } else {
                sum += hm.get(c);
            }

        }

        return sum + hm.get(s.charAt(s.length()-1));
    }


    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();

        System.out.println(rti.romanToInt("MCMXCIV"));
    }
}
