import java.util.Arrays;

public class RotateArray {

    /*
    Problem No: 189
    Problem Title:  Rotate Array



    Difficulty: Medium
    URL: https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
    Trick: Solve on paper importance!! && k modulo!!

    todo: check it in-place
    */

    public void rotate(int[] nums, int k) {

        int len = nums.length;
        k = k % len;
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            if (k == 0) k = len;
            newArr[i] = nums[len - k--];
        }
        System.arraycopy(newArr, 0, nums, 0, len);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        RotateArray pr = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 0;
        pr.rotate(arr, k);
    }

}
