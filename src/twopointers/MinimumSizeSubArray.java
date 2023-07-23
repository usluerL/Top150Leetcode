package twopointers;

public class MinimumSizeSubArray {


/*
    Problem No: 209
    Problem Title:  Minimum Size Subarray Sum



    Difficulty: Medium
    URL: https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
    Trick: two pointer, if sum > target, while loop and sub. first pointer. important key is flow!!

    todo: do it again
    */

    public int minSubArrayLen(int target, int[] nums) {
        int minSubL = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;
        int sum = 0;
        while (second < nums.length) {
            sum += nums[second++];
            while (sum >= target) {
                minSubL = Math.min(minSubL, second - first);
                sum -= nums[first++];
            }
        }

        return minSubL == Integer.MAX_VALUE ? 0 : minSubL;
    }

    public static void main(String[] args) {
        int target = 15;
        int[] arr = {1, 2, 3, 4, 5};

        MinimumSizeSubArray mssa = new MinimumSizeSubArray();
        System.out.println(mssa.minSubArrayLen(target, arr));

    }
}
