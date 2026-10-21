package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {


//        // Array of primitives
//
//        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the numbers: ");
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//
////        for (int num : arr) {
////            System.out.print(num + " ");
////        }
//
//        // Array of objects
//
//        String[] str = new String[4];
//
//        // 2D Array
//
//        int[][] nums = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        };
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i) + "  ");
//        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }


    }
}
