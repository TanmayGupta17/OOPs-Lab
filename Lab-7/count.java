import java.util.*;

class object{
    object(){

    }
}
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count = 0;
        int flag = 1;
        while(flag == 1){
            object ob = new object();
            count++;
            System.out.println("create more objects?(Y/N): ");
            char c = sc.next().charAt(0);
            if (c =='n' || c =='N') break;
        }
        System.out.println("no of objects created: "+count);
    }
}
