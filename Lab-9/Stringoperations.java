import java.util.Scanner;

public class Stringoperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Convert the case of a string");
            System.out.println("3. Check if a string is a substring of the other");
            System.out.println("4. Replace a substring with 'Hello'");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the first string: ");
                    String string1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String string2 = scanner.nextLine();
                    String result = compareStrings(string1, string2);
                    System.out.println(result);
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    String string = scanner.nextLine();
                    String swappedString = swapCase(string);
                    System.out.println("String after case conversion: " + swappedString);
                    break;
                case 3:
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    String substringResult = checkSubstring(str1, str2);
                    System.out.println(substringResult);
                    break;
                case 4:
                    System.out.print("Enter the main string: ");
                    String mainString = scanner.nextLine();
                    System.out.print("Enter the substring to replace: ");
                    String subString = scanner.nextLine();
                    String replacedString = replaceSubstring(mainString, subString);
                    System.out.println("Updated string: " + replacedString);
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

    public static String compareStrings(String string1, String string2) {
        if (string1.equals(string2)) {
            return "Both strings are equal.";
        } else {
            return "Strings are not equal.";
        }
    }

    public static String swapCase(String string) {
        StringBuilder result = new StringBuilder(string.length());
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String checkSubstring(String string1, String string2) {
        if (string1.contains(string2) || string2.contains(string1)) {
            return "One string is a substring of the other.";
        } else {
            return "Neither string is a substring of the other.";
        }
    }

    public static String replaceSubstring(String mainString, String subString) {
        return mainString.replace(subString, "Hello");
    }
}
