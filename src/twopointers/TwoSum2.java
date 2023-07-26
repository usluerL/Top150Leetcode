package twopointers;

import java.util.Arrays;

public class TwoSum2 {

    /*
    Problem No: 167
    Problem Title:  Input Array Is Sorted

    Difficulty: Medium
    URL: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150
    Trick: TP, begin end, right shift, left shift ->> bigger smaller.

    */

    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int start = 0;
        int end = len - 1;
        int[] arr = new int[2];


        while (start < end) {
            if (numbers[start] + numbers[end] < target) {
                start++;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                arr[0] = start+1;
                arr[1] = end+1;
                break;
            }

        }

        return arr;

    }

    public static void main(String[] args) {
        int [] numbers = {-1,0,4,6,2,9};
        int target = 15;

        TwoSum2 pr = new TwoSum2();
        System.out.println(Arrays.toString(pr.twoSum(numbers, target)));
    }
}
