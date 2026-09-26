package DSA;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,52,45,8},
                {47,53,57,55,},
                {85,84,86},
                {59,87}
        };

        int target = 87;
        int[] ans = search(arr,target);    // format of return value {row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(searchmax(arr));
    }
    // find maximum

    static int searchmax(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;

    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target ){
                    return new int[] {row,col};
                }
            }

        }
        return new int[] {-1,-1};

    }

}
