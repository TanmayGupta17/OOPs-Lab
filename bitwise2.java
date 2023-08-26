import java.util.Scanner;

class bitwise2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int n = sc.nextInt();
        System.out.println("enter the value for a:");
        int a = sc.nextInt();
        int mul,div;
        mul = n<<a;
        div = n>>a;
        System.out.println(mul);
        System.out.println(div);


    }
}