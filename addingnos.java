import java.util.Scanner;

class Complex{
    int img;
    int real;
    
    Complex(int _img, int _real){
        img = _img;
        real = _real;
    }

    Complex Add(int integer, Complex comp){
        Complex c = new Complex(integer + comp.real, comp.img);
        return c;
    }

    Complex Add(Complex c1, Complex c2){
        Complex c3 = new Complex(c1.real+c2.real,c1.img+c2.img);
        return c3;
    }
    void display(){
        System.out.println("real: "+real+"img: "+img);
    }
}
public class addingnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter real no:");
        int x = sc.nextInt();
        System.out.println("enter imaginery no.");
        int y = sc.nextInt();
        Complex a = new Complex(y,x);
        System.out.println("enter real no:");
        int r = sc.nextInt();
        System.out.println("enter imaginery no.");
        int i = sc.nextInt();
        Complex b = new Complex(i,r);
        Complex c = b.Add(a,b);
        c.display();
    }
    
}
