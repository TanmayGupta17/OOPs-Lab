import java.util.*;

public class wrapper {
    public static void main(String[] args) {
        Integer i = 10;
        Double d = 5.5;
        System.out.println("Boxed");
        System.out.println(i);
        System.out.println(d);
        System.out.println("unboxed");
        i = i+10;
        System.out.println(i);
        d = d+4.0;
        System.out.println(d);

    }
        
}
