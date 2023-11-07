import java.util.*;
import java.util.Scanner;

class MyThreadusingRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created by implementing Runnable");
    }
}

class MyThreadusingThread extends Thread {
    public void run() {
        System.out.println("Thread created by extending Thread class");
    }
}

public class menuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println();
            System.out.println("1. Create Thread Using Thread Class\n2. Create Thread using Runnable class\n3.Exit");
            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Thread t1 = new Thread(new MyThreadusingThread());
                    t1.start();
                    break;
                case 2:
                    Thread t2 = new Thread(new MyThreadusingRunnable());
                    t2.start();
                    break;
                case 3:
                    System.out.println("Exiting.......");
                    System.exit(0);
                default:
                    System.out.println("Please Enter a valid option");
            }
        }
    }
}
