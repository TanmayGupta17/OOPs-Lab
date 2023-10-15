import java.util.Scanner;

class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lower limit:");
        int n = sc.nextInt();
        System.out.println("enter upper limit:");
        int m = sc.nextInt();
        int flag = 1;
        for(int i=n;i<=m;i++){
            for(int j=2;j<i;j++){
                if(i%j==0 ){
                    flag = 0;
                    break;
                }
                else if(i%j != 0 ){
                    flag = 1 ;
                    
                }
            }
            if(flag == 1){
                System.out.println(i);
            }
        }
    }
}
