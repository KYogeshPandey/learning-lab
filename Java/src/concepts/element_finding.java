package concepts;

import java.util.Scanner;

public class element_finding {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        int[] numbers ={1,3,6,2,8,4,0,7,8};
        String[] fruits = {"apple", "mango", "banana", "papaya"};
        int target = 2;
        String item;


        System.out.print("Enter the fruit you want to search: ");
        item = sc.nextLine();
        boolean isfound = false;

//        for (int i = 0; i < numbers.length; i++) {
//            if(target == numbers[i]){
//                System.out.println("Element is found at: " + i);
//                isfound = true;
//                break;
//            }
//
//        }
//        if (!isfound) {
//            System.out.println("Element not found in array");
//        }

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(item)) {
                System.out.println("item is at index "+ i);
                isfound = true;
                break;

            }

        }
        if(!isfound) {
            System.out.println("item not found");
        }
        sc.close();

    }
}
