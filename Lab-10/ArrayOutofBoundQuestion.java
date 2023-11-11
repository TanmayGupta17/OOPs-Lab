import java.util.*;

public class ArrayOutofBoundQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in an array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the position to display: ");
        int ele = sc.nextInt();
        try {
            System.out.println(array[ele]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Please enter a valid position no");
        }
        System.out.println("Continuing Execution.......");
    }
}
