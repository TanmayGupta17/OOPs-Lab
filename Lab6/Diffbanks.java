import java.util.*;

class Bank {
    int rate;
    int ab;

    Bank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Balance: ");
        ab = sc.nextInt();
    }

    void getRateofInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rate of interest: ");
        rate = sc.nextInt();
        int a = ab * (rate / 100);
        System.out.println(a);
    }
}

class AXISBANK extends Bank {
    AXISBANK() {
        rate = 9;
    }

    void getRateofInterest() {
        float a = ab * (rate / 100);
        System.out.println(a);
    }
}

class SBIBANK extends Bank {
    SBIBANK() {
        rate = 7;
    }

    void getRateofInterest() {
        float a = ab * (rate / 100);
        System.out.println(a);
    }
}

class ICICIBANK extends Bank {
    ICICIBANK() {
        rate = 8;
    }

    void getRateofInterest() {
        int a = (ab * rate) / 100;
        System.out.println(a);
    }
}

public class Diffbanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Your Bank\n");
        System.out.println("1.SBI Bank\n2.ICICI Bank\n3.AXIS Bank");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                SBIBANK s = new SBIBANK();
                s.getRateofInterest();
                break;
            case 2:
                ICICIBANK i = new ICICIBANK();
                i.getRateofInterest();
                break;

            case 3:
                AXISBANK a = new AXISBANK();
                a.getRateofInterest();
                break;

            default:
                Bank b = new Bank();
                b.getRateofInterest();
                break;
        }
    }

}
