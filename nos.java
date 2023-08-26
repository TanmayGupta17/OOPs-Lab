import java.util.Scanner;

class nos{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int countP=0;
        int countN=0;
        int countZ=0;
        System.out.println("enter the array:");
        int a[] = new int[20];
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if (a[i]>0){
                countP++;
            }
            else if(a[i]<0){
                countN++;
            } 
            else{
                countZ++;
            }
            
        }
        System.out.println("positive: "+countP);
        System.out.println("Negative: "+countN);
        System.out.println("zero: "+countZ);
    }
}