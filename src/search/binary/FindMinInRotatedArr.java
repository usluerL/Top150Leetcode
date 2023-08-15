package search.binary;

public class FindMinInRotatedArr {

    public int findMin(int[] nums) {
        return nums[findMinIndex(nums)];
    }

    public int findMinIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int len = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid + 1 <= len - 1 && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }
            if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
                return mid;
            } else {
                if (nums[start] < nums[mid]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FindMinInRotatedArr findMinInRotatedArr = new FindMinInRotatedArr();
        int [] nums = {9,11,13,15,1,2,3,4,5,6,7,8,9,10};
        System.out.println(findMinInRotatedArr.findMinIndex(nums));
    }

}
