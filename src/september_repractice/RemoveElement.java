package september_repractice;

import java.util.Arrays;

public class RemoveElement {


    //in place

    int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

    //stream
    public int removeElementStream(int[] nums, int val) {
        int[] ints = Arrays.stream(nums).filter(n -> n != val).toArray();
        System.out.println(Arrays.toString(ints));
        return ints.length;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        RemoveElement re = new RemoveElement();

        System.out.println(re.removeElement(arr, 2));
    }

}
