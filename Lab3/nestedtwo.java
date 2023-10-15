import java.util.Scanner;


class nestedtwo {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = {1,2,3,4,5};
    for(int k:arr)
        for(int i=0;i<arr.length;i++){
            System.out.println(k);
        }
}
