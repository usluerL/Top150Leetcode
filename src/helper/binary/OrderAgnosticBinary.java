package helper.binary;

public class OrderAgnosticBinary {

    public int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        OrderAgnosticBinary pr = new OrderAgnosticBinary();

        int [] arr = {6,5,4,3,2,1,0};

        System.out.println(pr.orderAgnosticBinarySearch(arr, 0, 0,6));
    }
}
