import java.util.Arrays;

public class RemoveDuplicatesII {

        /*
Problem No: 80
Problem Title:  Remove Duplicates
Difficulty: Medium
URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150

Trick: write if greater at the same place; handle zeroth case with i== 0 check, no need map, keep count variable.
*/

    public int removeDuplicates(int[] nums) {
       int i = 0;
       int count = 1;
        for (int num : nums) {
            if (i==0 || num > nums[i-1]){
                nums[i++] = num;
                count =1;
            } else if (num == nums[i-1] && count <2){
                nums[i++] = num;
                count++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        RemoveDuplicatesII pr = new RemoveDuplicatesII();
        int [] arr1 = {2,2,2,3,3,3,6,6};
        int [] arr = {1, 1, 1, 2, 2, 3, 3, 3};
        int [] arr3 = {2,2,2,3,3,3,6,6};
        int [] arr4 = {2,2,2,3,3,3,6,6};

        System.out.println(Arrays.toString(arr));
        System.out.println(pr.removeDuplicates(arr));
    }

}
