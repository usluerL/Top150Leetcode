package math.bitwise;


/*
Problem No: 191
Problem Title:  Number of 1 Bits


Difficulty: Easy
URL: https://leetcode.com/problems/number-of-1-bits/description/?envType=study-plan-v2&envId=top-interview-150

Trick: right shift 0 to 32 and check 1 or zero.

*/

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            count += (n >> i) & 1;
        }

        return count;
    }


    public static void main(String[] args) {
        NumberOf1Bits pr = new NumberOf1Bits();
        int n = -3;

        System.out.println(pr.hammingWeight(n));

    }
}
