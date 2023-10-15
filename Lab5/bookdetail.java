import java.util.Scanner;

class Book{
    String Title;
    String author;
    int edition;

    Book(String t, String a, int ed){
        Title = t;
        author = a;
        edition = ed;
    }

}

public class bookdetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[6];
        for(int i=0;i<6;i++){
            System.out.println("Enter name of Book:");
            String Title = sc.nextLine();
            System.out.println("Enter name of author");
            String author = sc.nextLine();
            System.out.println("enter edition no:");
            int edition = sc.nextInt();

            Book book = new Book(Title, author, edition);
            books[i] = book;
        }
        String choice = sc.nextLine();
        for(int i=0;i<6;i++){
            if (books[i].author == choice){
                System.out.println(books[i].Title+ "by"+ books[i].author);

            }
        }
    }
}
