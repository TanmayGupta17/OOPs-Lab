import java.util.Scanner;

class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        for (int i=0;i<n;i++){
            if (val == a[i]){
                System.out.println(i);
            }
        }
    }
}