package Practice;// import java.util.Scanner;
import java.util.Random;

public class if_Statements {
    public static void main(String[] args){

//        //if Statement = perform a block of code if its condition is True
//
//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        int age;
//        boolean isStudent;
//
//
//        //Group 1
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//
//        System.out.print("Enter Your age: ");
//        age = scanner.nextInt();
//
//        System.out.print("Are you a Student? (true/false): ");
//        isStudent = scanner.nextBoolean();
//
//
//
//        //Group 2
//        if (name.isEmpty()){
//            System.out.println("You didn't enter your name");
//        }
//        else{
//            System.out.println("Hi " + name + " !");
//        }
//
//        //Group 1
//
//        if (age >= 65) {
//            System.out.println("You are a Senior Citizen!👍");
//        }
//        else if (age >= 18){
//            System.out.println("You are an Adult! 👌");
//        }
//        else if (age < 0){
//            System.out.println("You haven't born yet 🤷‍♀️");
//        }
//        else if(age == 0){
//            System.out.println("You are a Baby! 😶‍🌫️");
//        }
//        else{
//            System.out.println("You are underAge");
//        }
//
//        // Group 3
//        if(isStudent){
//            System.out.println("You are a Student ");
//        }
//        else{
//            System.out.println("You are NOT a Student");
//        }

        Random rd = new Random();

        int num1 = rd.nextInt(1,6);
        int num2 = rd.nextInt(1,8);
        int num3 = rd.nextInt(1,9);

        boolean isHeads = rd.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
