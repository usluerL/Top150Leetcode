package hm;



                                /*
Problem No: 202
Problem Title:  HappyNumber

Difficulty: Easy
URL: https://leetcode.com/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150

Trick:  todo

                 */

public class HappyNumber {

    public boolean isHappy(int n) {

        for (int i = 0; i < 50; i++) {
            int sum = getSum(n);
            if (sum == 1) return true;
            n = sum;
        }
        return false;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += Math.pow(remainder, 2);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(1));

        int size = 4;
        int asize = size;
        size++;

        System.out.println(asize);






    }

}
