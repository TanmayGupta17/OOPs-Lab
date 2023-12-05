import java.util.*;

public class binaryManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 'a' and 'b': ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (1) {
            case 1:
                int result = (a << 2) + (b >> 2);
                System.out.println(result);
            case 2:
                boolean r = (b > 0);
                System.out.println(r);
            case 3:
                int res = (a + b * 100) / 10;
                System.out.println(res);
            case 4:
                int i = a & b;
                System.out.println(i);
                break;
        }

    }
}
