package twopointers;

public class MaxAverageSubArray1 {


                            /*
Problem No: 643
Problem Title: Maximum Average Subarray I
Difficulty: Easy
URL: https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75

Trick: Sliding Window - no need to calculate k sum every time.

                 */


    double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int i = 0; i < len - k; i++) {
            sum += nums[i + k] - nums[i];
            max = Math.max(max, sum);
        }
        return max/k;
    }


    //no need to calculate every time. calculate the difference and add some.

    public double findMaxAverageBasic(int[] nums, int k) {
        return calculateMax(nums, k) / k;
    }

    double calculateMax(int[] nums, int k) {
        int len = nums.length;
        if (len == 1) return nums[0];
        int first = 0;

        int max = Integer.MIN_VALUE;

        while (first + k <= len) {
            int localMax = 0;
            for (int i = first; i < k + first; i++) {
                localMax += nums[i];
            }
            max = Math.max(max, localMax);
            first++;
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 12};
        MaxAverageSubArray1 subArray1 = new MaxAverageSubArray1();


        System.out.println(subArray1.findMaxAverage(arr, 1));
    }

}
