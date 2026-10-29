package DSA;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {20, 15, 14, 8, 5, 2, -5, -2};
        int target = -5;
        int ans = ogbs(arr,target);
        System.out.println(ans);

    }
    static int ogbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
