package search.binary;


/*
Problem No: 33
Problem Title:  SearchOnRotatedSorted



Difficulty: Medium
URL: https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
Trick: Handle 4 rotation cases, start < mid , start > mid, rotate@Mid OR no rotation. if no rotation return len-1;

*/


public class SearchOnRotatedSorted {

    public int search(int[] nums, int target) {
        int peak = findPeakIndex(nums);
        int i = searchHelper(nums, 0, peak, target);
        if (i != -1) return i;
        return searchHelper(nums, peak + 1, nums.length - 1, target);


    }


    public int searchHelper(int[] nums, int start, int end, int target) {
        int len = nums.length;
        if (len == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = nums[mid];

            if (midVal == target) return mid;
            else if (midVal < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    public int findPeakIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = nums[mid];
            if (midVal > nums[mid + 1]) {
                return mid;
            } else {
                if (nums[start] < nums[mid]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        return nums.length-1;
    }


    public static void main(String[] args) {


        int[] nums = {8,1,2};



        SearchOnRotatedSorted pr = new SearchOnRotatedSorted();
        System.out.println(pr.findPeakIndex(nums));
        System.out.println(pr.search(nums,0));




    }

}
