import java.util.*;

class student {
    String name;
    int reg_no;
    int age;

    int Ugcount;
    int Pgcount;

    student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter registration no.: ");
        reg_no = sc.nextInt();
        System.out.println("Enter the age of the student: ");
        age = sc.nextInt();
    }
}

class UG extends student {
    long fees;
    int semester;

    UG() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter semester: ");
        semester = sc.nextInt();
        System.out.println("Enter fees of the course: ");
        fees = sc.nextLong();
        Ugcount++;
    }
}

class PG extends student {
    long fees;
    int semester;

    PG() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter semester: ");
        semester = sc.nextInt();
        System.out.println("Enter fees of the course: ");
        fees = sc.nextLong();
        Pgcount++;
    }
}

public class studentdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students for admission: ");
        int count = sc.nextInt();
        UG ugs[] = new UG[100];
        PG pgs[] = new PG[100];
        int ugInd = 0, pgInd = 0;
        int flag = 1;
        while (flag == 1) {
            System.out.println("Enter the course of the student\n");
            System.out.println("1.Undergraduate course\n2.Postgraduate course\n3.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ugs[ugInd++] = new UG();
                    break;

                case 2:
                    pgs[pgInd++] = new PG();
                    break;
            }
            System.out.println("Add more Students?(Y/N): ");
            int k = sc.next().charAt(0);
            if (k == 'n' || k == 'N')
                flag = 0;
        }
        System.out.println("choose which course of students to display\n");
        System.out.println("1.UG\n2.PG\n3.Both\n");
        int t = sc.nextInt();
        switch (t) {
            case 1:
                for (int i = 0; i < ugs.length; i++) {
                    System.out.println(ugs[i].name);
                    // System.out.println(ugs[i]);
                }
                break;
            case 2:
                for (int i = 0; i < pgs.length; i++) {
                    System.out.println(pgs[i].name);
                    // System.out.println(ugs[i]);
                }
                break;
            case 3:
                System.out.println("Name of the UG students");
                for (int i = 0; i <= ugInd; i++) {
                    System.out.println(ugs[i].name);
                    // System.out.println(ugs[i]);
                }
                System.out.println("Name of the PG");
                for (int j = 0; j <= pgInd; j++) {
                    System.out.println(pgs[j].name);
                }
                break;

        }

    }

}
