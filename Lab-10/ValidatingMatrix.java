import java.util.*;

class NotaSquareMatixException extends Exception {
    public NotaSquareMatixException(String s) {
        super(s);
    }
}

public class ValidatingMatrix {

    static void validate(int row, int cols) throws NotaSquareMatixException {
        if (row != cols) {
            throw new NotaSquareMatixException("Not a square matrix");
        } else {
            System.out.println("Valid Matrix");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows and Columns: ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        try {
            validate(row, cols);
        } catch (NotaSquareMatixException e) {
            // TODO: handle exception
            System.out.println("Exception occured: " + e);
        }
        System.out.println("Continuing Excecution.........");
    }
}
