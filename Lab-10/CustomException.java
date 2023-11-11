import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String s) {
        super(s);
    }
}

public class CustomException {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("not eligible for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age of the Candidate: ");
        int age = sc.nextInt();
        try {
            validate(age);
        } catch (InvalidAgeException e) {
            // TODO: handle exception
            System.out.println("Not a valid age");
            System.out.println("Exception occured: " + e);
        }
        System.out.println("Continuing Executing........");
    }
}
