package sorting;

import java.util.Arrays;

public class SortAnArray {


    //bubble sort. 0(n^2)
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums;
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j - 1, j);
                }
                swapped = true;
            }
            if (!swapped) break;
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;
    }

    public static void main(String[] args) {

        SortAnArray pr = new SortAnArray();
        int[] nums = {3, 7, 6, 5, 4, 2};
        pr.sortArray(nums);

    }

}
