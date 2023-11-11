import java.util.*;

public class studentinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter Rollno.: ");
        String Rollno = sc.nextLine();
        System.out.println("Enter marks for 3 subjects: ");
        String marks[] = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + i);
            marks[i] = sc.nextLine();
        }
        int s1 = 0, s2 = 0, s3 = 0;
        boolean valid = false;
        while (valid == false) {
            try {
                s1 = Integer.parseInt(marks[0]);
                s2 = Integer.parseInt(marks[1]);
                s3 = Integer.parseInt(marks[2]);
                valid = true;
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("Please enter a valid marks");
            }
        }
        double percentage = (s1 + s2 + s3) / 3;
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + Rollno);
        System.out.println("Marks in Subject 1: " + marks[0]);
        System.out.println("Marks in Subject 2: " + marks[1]);
        System.out.println("Marks in Subject 3: " + marks[2]);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
