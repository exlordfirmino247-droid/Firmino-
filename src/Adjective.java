import java.util.Scanner;

public class Adjective {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter one more adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("\nYour story:");
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + ".");
        System.out.println("It started to " + verb1 + " around.");
        System.out.println("What a " + adjective3 + " day!");

        scanner.close();
    }
}