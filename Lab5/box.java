import java.util.*;

class item {
    double width;
    double height;
    double depth;
    
    item(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
        System.out.println("box created");
    }
    void volume(){
        double vol = width*height*depth;
        System.out.println(vol);
    }

    
}
class box{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter width:");
    double w = sc.nextDouble();
    System.out.println("Enter height:");
    double h = sc.nextDouble();
    System.out.println("Enter depth:");
    double d= sc.nextDouble();
    item mybox=new item(w,h,d);
    mybox.volume();
}


}

