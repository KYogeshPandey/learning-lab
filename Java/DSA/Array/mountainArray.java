public class mountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,5,6,8,10,4,3,1};
        int target = 4;
        int index = peakIndexInMountainArray(arr);
        int ans = ogbs(arr,target,index);
        System.out.println(ans);

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <  end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                // you are at decreasing part of array
                // this may be ans, but look at left
                end = mid;
            } else {
                // mid + 1 element is greater than mid
                start = mid + 1;
            }
        }
        // in the end start == end and pointing to the largest number because of the two checks
        // start and end are always trying to find  max element in the above two checks
        // hence when they point to a element that is the max element
        return start;
    }
    static int ogbs(int[] arr, int target, int index) {
        int start = 0;
        int end = index;

        // check for ascending order till peak_index
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        // first part mein target nhi mila
        if (start > end) {
            start = index + 1;
            end = arr.length - 1;

            // binary search in descending part
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] == target) {
                    return mid;
                }
            }
        }
        return -1;
    }
}
