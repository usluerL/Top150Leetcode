package helper.binary;

public class FindPivot {


    public int findPeakIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int start = 0;
        int end = len - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int midVal = nums[mid];
            if (midVal > nums[mid + 1]) {
                return mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2,3};
        FindPivot pr = new FindPivot();

        System.out.println(pr.findPeakIndex(nums));
    }
}
