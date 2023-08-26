import java.util.Scanner;

class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no to check:");
        int n = sc.nextInt();
        int r = n;
        int x;
        int cube=0;
        while (n>0){
            x = n%10;
            cube = x*x*x +cube;
            n=n/10;
            
        }
        if (cube == r){
            System.out.println("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
        
    }
    
}
