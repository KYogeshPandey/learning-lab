public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        int pivot = findPivotwithDuplicates(arr);
        int ans = pivot + 1;
        System.out.println(ans);

    }
    static int findPivotwithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            // if elements at middle, start, end are equal just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                // But what if start or end is pivot
                // check is start is pivot
                if (start < end && arr[start] > arr[start+1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (start < end && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted so the pivot is should be on right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
