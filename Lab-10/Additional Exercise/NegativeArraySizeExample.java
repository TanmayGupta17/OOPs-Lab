import java.util.*;

public class NegativeArraySizeExample {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array: ");
      int negativeSize = sc.nextInt();
        try {
            if (negativeSize < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative.");
            }

            // Attempting to create an array with negative size
            int[] array = new int[negativeSize];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
    }
}
