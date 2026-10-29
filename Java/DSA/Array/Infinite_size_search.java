public class Infinite_size_search {
    public static void main(String[] args) {
        int[] arr = {-5, -3, 0, 2, 4, 5, 9, 77, 99, 100};
        int target = 4;

        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr, int target) {
        // find the range
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (arr[end] < target) {
            int tempStart = end + 1;
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                start = mid - 1;
            }
        }
        return -1;
    }
}
