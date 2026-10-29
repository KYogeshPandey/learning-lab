package DSA;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-5, -3, 0, 2, 4, 5, 9, 77, 99, 100};
        int target = -5;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    // return an index
    // return -1 if not present

    static int binarySearch(int[] arr, int  target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
