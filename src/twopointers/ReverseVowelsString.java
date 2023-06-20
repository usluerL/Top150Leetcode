package twopointers;

            /*
Problem No: 345
Problem Title:  Reverse Vowels of a String
Difficulty: Easy
URL: https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75

Trick: str -> toCharArr since strings are immutable. also include UpperCase letters.
*/

import java.util.Set;

public class ReverseVowelsString {

    public String reverseVowels(String s) {
        int len = s.length();
        if (len == 1) return s;
        Set<Character> vowels = Set.of('a','A', 'e','E', 'i' ,'I', 'o','O', 'u','U');
        char[] charArr = s.toCharArray();
        int first = 0;
        int sec = len - 1;
        while (first < sec) {
            char lChar = s.charAt(first);
            char rChar = s.charAt(sec);
            if (vowels.contains(lChar) && vowels.contains(rChar)) {
                swap(charArr, first, sec);
                first++;
                sec--;
            } else if (vowels.contains(lChar)) {
                sec--;
            } else if (vowels.contains(rChar)) {
                first++;
            } else {
                first++;
                sec--;
            }
        }
        return String.valueOf(charArr);
    }

    public void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        ReverseVowelsString rvs = new ReverseVowelsString();
        System.out.println(rvs.reverseVowels("hello"));
    }

}
