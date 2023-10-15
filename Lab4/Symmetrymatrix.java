import java.util.Scanner;

public class Symmetrymatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col;
        int flag = 1;
        System.out.println("enter no of rows and columns:");
        row = sc.nextInt();
        col = sc.nextInt();
        int mat[][] = new int [row][col];
        if(row != col){
            System.out.println("not symmetric");
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int transpose[][] = new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[i][j] = mat[j][i];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if( transpose[i][j] != mat[i][j]){
                    flag = 0;
                    break;
                }
                   
            }
        }
        if (flag == 0){
            System.out.println("non-symmetric matrix");
        }
        else {
            System.out.println("Symmetric matrix");
        }
        
    }    
}
