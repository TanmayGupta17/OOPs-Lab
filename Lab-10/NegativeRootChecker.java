import java.util.Scanner;

public class NegativeRootChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }

            double result = Math.sqrt(number);

            System.out.println("Square root of " + number + " is: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
