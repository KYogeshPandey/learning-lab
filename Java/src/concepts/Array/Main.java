package concepts.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] arr = new int[5];
        String[] str = new String[5];

        Scanner sc = new Scanner(System.in);

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();

        }

        System.out.println(Arrays.toString(str));

//        System.out.println(Arrays.toString(arr));
        str[1] = "yogesh";
        System.out.println(Arrays.toString(str));

        sc.close();
    }
}
