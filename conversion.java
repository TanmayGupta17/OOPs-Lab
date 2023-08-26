import java.util.Scanner;

class conversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        char ch = sc.next().charAt(0);

        int a = (byte) i;
        int b = (int) ch;
        byte e = (byte) d;
        int f = (int) d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        System.out.println(f);
        
    }
}
