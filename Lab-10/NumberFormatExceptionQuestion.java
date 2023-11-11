import java.util.Scanner;

public class NumberFormattExceptionQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        String s = sc.nextLine();
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Please enter a valid number");
        }
        System.out.println("Continuing Execution......");
    }
}
