package DSA;

public class LINEARSEARCH {
    public static void main(String[] args) {

        int[] nums = {12,42,55,18,49,456,525,45,75};
        int target = 456;
        int ans = linearsearch2(nums, target);

        System.out.println(ans);


    }

    // search the target and return the element

    static int linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop

        for (int element : arr) {
            if (element == target) {
                return element;
            }

        }

        // this line will execute if none of the return statements above executed
        // hence the target not found
        return -1;
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1

    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }

        }

        // this line will execute if none of the return statements above executed
        // hence the target not found
        return -1;

    }
}
