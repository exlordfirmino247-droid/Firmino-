import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again;

        do {
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = input.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                case '%':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = num1 % num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
            }

            System.out.print("Calculate again? (y/n): ");
            again = input.next().charAt(0);
            System.out.println();

        } while (again == 'y' || again == 'Y');

        System.out.println("Goodbye!");
        input.close();
    }
}
