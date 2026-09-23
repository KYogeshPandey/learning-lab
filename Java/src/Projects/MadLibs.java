import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Mad Libs game

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        String verb2;
        String adjective4;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (-ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb2 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective4 = scanner.nextLine();



        System.out.println("\nToday I went to a " + adjective1 + " Zoo.");
        System.out.println("In an Exhibit, I saw " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1);
        System.out.println("I was " + adjective3 + " !");
        System.out.println("My day " + verb2 + " " + adjective4 + ".");
        System.out.println("I was Happy !");

        scanner.close();

    }
}
