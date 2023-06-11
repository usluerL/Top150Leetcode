import java.util.Arrays;

public class RemoveElement {

    /*
Problem No: 27
Problem Title:  Remove Element
Difficulty: Easy
URL: https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150

Trick: Tp approach, a reader pointer and a writer pointer.
*/

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) return 0;
        int i = 0;
        int j = 0;

        while (i < len ){
            if (nums[i] != val){
                nums[j] = nums [i];
                i ++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,2,2,3,2,2,6,2};
        RemoveElement pr = new RemoveElement();

        System.out.println(pr.removeElement(arr, 2));

    }
}
