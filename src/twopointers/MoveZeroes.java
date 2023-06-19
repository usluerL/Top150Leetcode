package twopointers;

import java.util.Arrays;

public class MoveZeroes {


                            /*
Problem No: 283
Problem Title: Move Zeroes
Difficulty: Easy
URL: https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

Trick: Two Pointer first, second -> 4 cases first 0, second 0 ...so on.

                 */

    public void moveZeroes(int[] nums) {
       int len = nums.length;
       if (len ==1) return;
       int first = 0;
       int second = 1;
       while (second < len){
           if (nums[first] == 0 && nums [second] !=0) swap(nums,first,second);
           else if (nums[first] == 0 && nums[second]==0){
               second++;
           } else {
               first++;
               second++;
           }
       }
    }


    public void swap (int [] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    public static void main(String[] args) {
        int [] arr = {0,0,2,0,2,0,2,3,3,3,4,0};

        MoveZeroes mz = new MoveZeroes();



        mz.moveZeroes(arr);
    }

}
