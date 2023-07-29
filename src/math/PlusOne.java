package math;

import java.util.Arrays;

                                /*
Problem No: 66
Problem Title:  Plus One


Difficulty: Easy
URL: https://leetcode.com/problems/plus-one/description/?envType=study-plan-v2&envId=top-interview-150

Trick:  return early, else [0], no need to make them zero. if creating new one!

                 */


public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9){
                digits[i]++;
               return digits;
            } else {
                digits[i] = 0;
            }
        }
        int [] arr = new int[digits.length+1];
        arr[0]= 1;
        return  arr;
    }


    public static void main(String[] args) {
        int [] digits = {9};

        PlusOne pr = new PlusOne();
        System.out.println(Arrays.toString(pr.plusOne(digits)));
    }
}
