package search.binary;

//todo : revisit boundary counditions carefully!

public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int end = len-1;
        int start = 0;
        while (start < end){
            int mid = start + (end-start)/2;
            if (nums[mid] > nums[mid+1]) end = mid;
            else start = mid+1;
        }

        return start % len;
    }


    public static void main(String[] args) {
        FindPeakElement peakElement = new FindPeakElement();
        int [] nums = {1,2,3,4,3,2,1};

        System.out.println(peakElement.findPeakElement(nums));
    }
}
