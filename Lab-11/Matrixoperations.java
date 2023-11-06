import java.util.*;

class Matrix {
    int row, cols;
    int data[][];

    Matrix(int row, int cols) {
        this.row = row;
        this.cols = cols;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no of rows and cols: ");
        // row = sc.nextInt();
        // cols = sc.nextInt();
        this.data = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void DisplayMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void Displaytranspose() {
        int[][] transpose = new int[cols][row];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(data[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    void Maxvalue() {
        int max = data[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (max < data[i][j]) {
                    max = data[i][j];
                }
            }
        }
        System.out.println("Max value of Thread: " + max);
        System.out.println();
    }

    void DisplayPrincipalDiagoal() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j)
                    System.out.println(data[i][j]);
            }
        }
        System.out.println();
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Cols: ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        Matrix matrix = new Matrix(row, cols);

        Thread t1 = new Thread(() -> matrix.DisplayMatrix());
        Thread t2 = new Thread(() -> matrix.Displaytranspose());
        Thread t3 = new Thread(() -> matrix.Maxvalue());
        Thread t4 = new Thread(() -> matrix.DisplayPrincipalDiagoal());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("t1 status: " + t1.isAlive());
        System.out.println("t2 status: " + t2.isAlive());
        System.out.println("t3 status: " + t3.isAlive());
        System.out.println("t4 status: " + t4.isAlive());

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();

            System.out.println("t1 status: " + t1.isAlive());
            System.out.println("t2 status: " + t2.isAlive());
            System.out.println("t3 status: " + t3.isAlive());
            System.out.println("t4 status: " + t4.isAlive());

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
