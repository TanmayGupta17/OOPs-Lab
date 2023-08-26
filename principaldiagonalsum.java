import java.util.Scanner;

public class principaldiagonalsum {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0;
    int a[][] = new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            a[i][j] = sc.nextInt();
        }
    }
    for(int x=0;x<n;x++){
        for(int y=0;y<n;y++){
            if(x == y){
                sum = a[x][y] + sum;
            }
        }
    }
    System.out.print(sum);
}
