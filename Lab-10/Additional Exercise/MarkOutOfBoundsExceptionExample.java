class MarkOutOfBoundsException extends Exception {
    public MarkOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int mark;

    public Student(String name, int mark) throws MarkOutOfBoundsException {
        this.name = name;

        if (mark < 0 || mark > 100) {
            throw new MarkOutOfBoundsException("Mark is out of bounds (0-100): " + mark);
        }

        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}

public class MarkOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            // Creating a student with a mark outside the valid range
            Student student = new Student("John", 110);

            System.out.println("Student details: ");
            System.out.println("Name: " + student.getName());
            System.out.println("Mark: " + student.getMark());
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Caught MarkOutOfBoundsException: " + e.getMessage());
        }
    }
}
