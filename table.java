import java.util.Scanner;

class table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int n=sc.nextInt();
        int t;
        for(int i=1;i<=10;i++){
            t = n * i;
            System.out.println(t);
        }
        

    }
}