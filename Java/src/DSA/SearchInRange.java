package DSA;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {14,3,57,99,0,87,888};
        int target = 87;
        System.out.println(search(arr, target, 0, 6));


    }

    static int search (int[] range, int target, int start, int end){
        if (range.length == 0){
            return -1;
        }

        for (int i = start; i < end; i++) {
            int element = range[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
