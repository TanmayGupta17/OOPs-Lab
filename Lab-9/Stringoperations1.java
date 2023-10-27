import java.util.*;

public class Stringoperations1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check if a string is a palindrome");
            System.out.println("2. Write the string in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate the original string and the reversed string");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String inputString = scanner.nextLine();
                    boolean isPalindrome = isPalindrome(inputString);
                    if (isPalindrome) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    String alphaOrderString = sortAlphabetically(scanner.nextLine());
                    System.out.println("String in alphabetical order: " + alphaOrderString);
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    String reversedString = reverseString(scanner.nextLine());
                    System.out.println("Reversed string: " + reversedString);
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    String originalString = scanner.nextLine();
                    String reversed = reverseString(originalString);
                    String concatenatedString = originalString + reversed;
                    System.out.println("Concatenated string: " + concatenatedString);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String sortAlphabetically(String str) {
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
