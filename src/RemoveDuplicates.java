import java.util.Arrays;

public class RemoveDuplicates {

        /*
Problem No: 26
Problem Title:  Remove Duplicates
Difficulty: Easy
URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

Trick: write if greater at the same place; handle zeroth case with i== 0 check.
*/

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i == 0 || num > nums[i - 1]) {
                nums[i++] = num;
            }
        }


        return i;
    }


    public static void main(String[] args) {
        RemoveDuplicates pr = new RemoveDuplicates();
        int [] arr = {2,3,4,2,2,3,2,2,6,2};

        System.out.println(Arrays.toString(arr));
        System.out.println(pr.removeDuplicates(arr));
    }

}
