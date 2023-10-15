import java.util.Scanner;

class leapyear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4 != 0){
            System.out.print("common year");
        }
        else if (year % 100 != 0){
            System.out.print("leap year");
        }
        else if (year%400 != 0){
            System.out.print("Common year");
        }
        else {
            System.out.print("Its a leap year!");
        }
    }
}