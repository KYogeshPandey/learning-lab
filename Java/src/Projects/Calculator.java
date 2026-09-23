
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validoperation = true;

        System.out.print("Enter the First number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the opertor (+, -, /, *, ^) : ");
        operator = sc.next().charAt(0);

        System.out.print("Enter the Second number: ");
        num2 = sc.nextDouble();

        switch(operator){

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by Zero!");
                    validoperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid operation!");
                validoperation = false;
            }

        }
        if(validoperation){
            System.out.println(result);
        }


        sc.close();
    }
}
