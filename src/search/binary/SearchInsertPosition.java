package search.binary;

public class SearchInsertPosition {


    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (target > nums[len - 1]) return len;
        if (target < nums[0]) return 0;
        int start = 0;
        int end = len-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = nums[mid];
            if (target == midVal) return mid;
            else if (midVal < target) start = mid + 1;
            else end = mid-1;
        }


        return start;
    }

    public static void main(String[] args) {
        SearchInsertPosition pr = new SearchInsertPosition();
        int [] arr = {1,3,5};

        System.out.println(pr.searchInsert(arr, 3));
    }
}
