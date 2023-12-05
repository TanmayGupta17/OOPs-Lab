import java.util.*;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Duplication is Allowed\n2.Duplication not Allowed\n ");
        int ch = sc.nextInt();
        int a[] = { 1, 2, 3, 4 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        switch (ch) {
            case 1:
                System.out.println("Printing nos: ");
                for (int x = 0; x < 4; x++) {
                    for (int b = 0; b < 4; b++) {
                        for (int c = 0; c < 4; c++) {
                            for (int d = 0; d < 4; d++) {
                                System.out.println(a[x] + "" + a[b] + "" + a[c] + "" + a[d]);
                            }
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Printing nos: ");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        for (int k = 0; k < 4; k++) {
                            for (int l = 0; l < 4; l++) {
                                if (i != j && j != k && k != l && i != k && i != l && j != l) {
                                    System.out.println(a[i] + "" + a[j] + "" + a[k] + "" + a[l]);
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
