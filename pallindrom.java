import java.util.Scanner;

class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        int n= sc.nextInt();
        int x=n;
        int sum=0;
        while (n>0){
            int r=n%10;
            sum = sum*10 +r;
            n=n/10;
        }
        if (sum==x){
            System.out.println("pallindrom");
        }
        else {
            System.out.println("not a pallindrom");
        }
    }
}