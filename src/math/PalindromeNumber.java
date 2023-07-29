package math;

                                /*
Problem No: 29
Problem Title:  Palindrome Number

Difficulty: Easy
URL: https://leetcode.com/problems/palindrome-number/?envType=study-plan-v2&envId=top-interview-150

Trick:  todo

                 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String numStr = String.valueOf(x);
        int len = numStr.length();
        int start = 0;
        int end = len - 1;

        while (start < end) {
            if (numStr.charAt(start++) != numStr.charAt(end--)) return false;
        }
        return true;
    }

    public boolean isPalindromeFollowUp(int x) {
        if (x < 0) return false;

        return x == reverse(x);

    }

    private double reverse(int n) {
        double num = 0;
        int i = 1;
        while (n > 0) {
            int remainder = n % 10;
            num = num * 10 + remainder;
            n = n / 10;
        }

        if (num > Integer.MAX_VALUE) num = -1;
        return num;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();

        System.out.println(pn.isPalindromeFollowUp(21112));

       // System.out.println(pn.reverse(11152));
    }
}
