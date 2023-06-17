package twopointers;

import java.util.Locale;

public class ValidPalindrome {

                    /*
Problem No: 125
Problem Title: Valid Palindrome
Difficulty: Easy
URL: hhttps://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150

Trick: Two Pointer after clearing non alphanumeric values.

                 */

    public boolean isPalindrome(String s) {
        String alphaNum = clearNonAlphaNumeric(s).toLowerCase();
        int len = alphaNum.length();
        if (len == 1) return true;
        int first = 0;
        int second = len - 1;


        while (first < second) {
            if (alphaNum.charAt(first) != alphaNum.charAt(second)) {
                return false;
            }
            first++;
            second--;
        }
        return true;
    }

    private String clearNonAlphaNumeric(String s) {

        return s.replaceAll("[^a-zA-Z0-9]", "");
    }


    public static void main(String[] args) {

        ValidPalindrome vp = new ValidPalindrome();

        System.out.println(vp.isPalindrome("      a      "));
    }
}
