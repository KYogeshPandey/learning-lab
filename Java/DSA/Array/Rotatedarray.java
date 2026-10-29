public class Rotatedarray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 1;
        int ans = search(arr,target,0);
        System.out.println(ans);

    }
    static int search(int[] nums, int target, int start) {
        int pivot = findPivot(nums);

        // if you did not find pivot that means the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if pivot is found , that means you have two dsorted arrays
        if (nums[pivot] == target) {
            return pivot;
        } else if (nums[start] < target) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);

    }
    static int binarySearch(int[] arr, int  target, int start, int end) {

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
    // this will not work with duplicates
    static int findPivot(int[] arr) {
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
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // this will work with duplicates
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
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end-1]){
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
