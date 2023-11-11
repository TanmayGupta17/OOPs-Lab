class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}

public class EvenNumberChecker {
    public static void main(String[] args) {
        try {
            int number = 6; // Replace with the number you want to check

            if (number % 2 == 0) {
                throw new EvenNumberException("EvenNumberException: The number is even.");
            }

            System.out.println("The number is odd.");
        } catch (EvenNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
