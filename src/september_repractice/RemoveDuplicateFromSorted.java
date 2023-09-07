package september_repractice;

public class RemoveDuplicateFromSorted {


    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i == 0 || num > nums[i-1]) {
                nums[i++] = num;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        RemoveDuplicateFromSorted removeDuplicateFromSorted = new RemoveDuplicateFromSorted();
        int [] arr = {2,2,2,3,3,3,4,5,5,6};
        int i = removeDuplicateFromSorted.removeDuplicates(arr);
        System.out.println(i);

    }
}
