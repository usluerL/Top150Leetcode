package search.binary;

import java.util.Arrays;


/*
Problem No: 34
Problem Title:  Find First and Last Position of Element in Sorted Array



Difficulty: Medium
URL: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

Trick: if it is first occurrence, end= mid-1, if not, -> start=mid+1 do not return mid right away.

*/


public class FirstAndLastPositionOfElement {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        int i = searchRangeHelper(nums, target, true);
        int j = searchRangeHelper(nums, target, false);

        ans[0] = i;
        ans[1] = j;


        return ans;
    }

    public int searchRangeHelper(int[] nums, int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = nums[mid];
            if (target < midVal) end = mid -1;
            else if (target > midVal) start = mid + 1;
            else {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FirstAndLastPositionOfElement ofElement = new FirstAndLastPositionOfElement();

        int[] arr = {5, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(ofElement.searchRange(arr, target)));
    }
}
