package hm;



                            /*
Problem No: 242
Problem Title:  Valid Anagram

Difficulty: Easy
URL: https://leetcode.com/problems/valid-anagram/

Trick: letter fixed size 26.  - 'a'  countMap -> charArr.

                 */

public class ValidAnagram {

    boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] charArr = new char[26];
        for (int i = 0; i <s.length() ; i++) {
            charArr[s.charAt(i) -'a'] ++;
            charArr[t.charAt(i) -'a'] --;
        }
        for (char c : charArr) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();

        System.out.println(va.isAnagram("a", "b"));
    }
}
