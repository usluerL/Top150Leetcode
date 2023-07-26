package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

            /*
Problem No: 15
Problem Title:  3Sum
Difficulty: Medium
URL: https://leetcode.com/problems/3sum/

Trick: TwoSum + DuplicateNumbers, tp approach
*/

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ansList = new ArrayList<>();
        for (int i = 0; i <nums.length && nums[i] <= 0 ; i++) {
            if (i == 0 || nums[i-1] != nums[i]){
                twoSum(nums,i,ansList);
            }

        }
        return ansList;
    }

    private void twoSum(int[] numbers, int i, List<List<Integer>> list) {
        int len = numbers.length;
        int start = i +1;
        int end = len - 1;
        Arrays.sort(numbers);
        ArrayList<Integer> arr = new ArrayList<>();

        while (start < end) {
            int sum = numbers[i] + numbers[start] + numbers[end];
            if (sum < 0 ){
                start ++;
            } else if (sum > 0){
                end--;
            } else {
                list.add(Arrays.asList(numbers[i], numbers[start],numbers[end]));
                start++;
                end--;
                while (start < end && numbers[start] == numbers[start - 1])
                    ++start;
            }
        }
    }

    public static void main(String[] args) {
        ThreeSum pr = new ThreeSum();
        int[] nums = {-2, 0, 0,2,2};
        System.out.println(pr.threeSum(nums));
    }

}
