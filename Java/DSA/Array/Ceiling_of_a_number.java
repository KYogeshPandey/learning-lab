public class Ceiling_of_a_number {
    public static void main(String[] args) {
        int[] arr = {-5, -3, 0, 2, 4, 5, 9, 77, 99, 100};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);

    }

    // return the index of smallest number >= target
    static int ceiling(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        // but what if the target is smaller than the smaller number
        if (target < arr[s]) {
            return -1;
        }
        while(s <= e) {
            int mid = s + (e - s)/2;
            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return s;
    }
}
