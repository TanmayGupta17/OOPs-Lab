import java.util.Scanner;

class nested {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = 0;
        for(int i=0;i<n;i++){
            k++;
            for(int j=0;j<=i;j++){
                
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
