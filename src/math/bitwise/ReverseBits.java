package math.bitwise;



/*
Problem No: 190
Problem Title:  Reverse Bits


Difficulty: Easy
URL: https://leetcode.com/problems/reverse-bits/description/?envType=study-plan-v2&envId=top-interview-150

Trick:  >>i  ---- <<31-i in order to reverse.

*/


public class ReverseBits {

    public int reverseBits(int n) {
       int res = 0;
        for (int i = 0; i <32 ; i++) {
            int bit = (n >> i) & 1;
            res = res | (bit << (31-i));
        }
        return res;
    }


    public static void main(String[] args) {
        ReverseBits pr = new ReverseBits();


    }
}
