package math;

                                /*
Problem No: 172
Problem Title:  Factorial Trailing Zeroes


Difficulty: Medium
URL: https://leetcode.com/problems/factorial-trailing-zeroes/?envType=study-plan-v2&envId=top-interview-150

Trick:  todo

                 */

import java.math.BigInteger;

public class FactorialTrailingZeroes {


    /*TLE more than O(n^2)*/

    public int trailingZeroesTle(int n) {
        int count = 0;
        BigInteger res = factorial(n);
        while (res.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            res = res.divide(BigInteger.TEN);
            count++;
        }

        return count;
    }

    private BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public int trailingZeroes(int n) {
        int zeros = 0;
        for (int i = 5; i <= n; i += 5) {
            int pow5 = 5;
            while (i % pow5 == 0) {
                zeros++;
                pow5 *= 5;
            }
        }
        return zeros;
    }

    public int trailingZeroesBest(int n) {
        int zeroCount = 0;
        while (n > 0) {
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }


    public static void main(String[] args) {
        FactorialTrailingZeroes ftz = new FactorialTrailingZeroes();
        System.out.println(ftz.trailingZeroesTle(12));
        System.out.println(ftz.trailingZeroes(12));
    }


}
