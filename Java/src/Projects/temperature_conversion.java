
import java.util.Scanner;

public class temperature_conversion {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("convert temperature into Celcius or Farenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("new temperature is %.2f°%s", newtemp, unit);

        sc.close();

    }
}
