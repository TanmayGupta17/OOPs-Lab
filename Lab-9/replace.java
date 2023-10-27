import java.util.*;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter String to replace: ");
        String s2 = sc.next();
        StringBuffer str = new StringBuffer();
        int l = s2.length();
        System.out.println("Enter String to be replaced with: ");
        String s3 = sc.next();
        str.append(s3);
        System.out.println(s1.replace(s2, str));
    }
}
