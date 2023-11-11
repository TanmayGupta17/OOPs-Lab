import java.util.Scanner;

class InputException extends Exception {
    public InputException(String message) {
        super(message);
    }
}

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        try {
            while (true) {
                System.out.print("Enter a number (-1 to stop): ");
                double userInput = scanner.nextDouble();

                if (userInput == -1) {
                    break;
                }

                if (userInput % 1 != 0) {
                    throw new InputException("Floating point numbers are not allowed.");
                }

                sum += (int) userInput;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (InputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Sum of entered numbers: " + sum);
    }
}
