package twopointers;


                            /*
Problem No: 392
Problem Title:  IsSubsequence

Difficulty: Easy
URL: https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150

Trick: TP, do not forget s = "" case. also, early return if first == s.length()

                 */

public class IsSubSequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.length() == 0 ) return true;
        int first = 0;
        int second = 0;
        while (second < t.length()) {
            char c = s.charAt(first);
            if (t.charAt(second) == c) {
                first++;
            }
            second++;
            if (first == s.length()) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        IsSubSequence pr = new IsSubSequence();
        String s = "afefefe";
        String t = "af";

        System.out.println(pr.isSubsequence(s, t));
    }

}
