import java.util.Scanner;

class claculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int check;
        do{
        float n,m;
        System.out.println("Enter a nos:");
        n = sc.nextFloat();
        m = sc.nextFloat();
        System.out.println("enter the operator:");
        char op = sc.next().charAt(0);

        switch(op){
            case'+':
                System.out.println(n+m);
                break;
            case'-':
                System.out.println(n-m);
                break;
            case'*':
                System.out.println(n*m);
                break;
            case'/':
                System.out.println(n/m);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        System.out.println("Do another calculation(y/n):");
        char d = sc.next().charAt(0);
        

        if (Character.compare(d,'y')== 0){
            check = 1;
        }
        else {
            check = 0;
        }
    }  while(check == 1);
    }
}