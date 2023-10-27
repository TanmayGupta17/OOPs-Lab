import java.util.*;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        int vowels = 0;
        int words = 1;
        int lines = 0;
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        String t = s.trim();
        char c[] = t.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z')
                ch++;
            if (c[i] == ' ')
                words++;
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
                vowels++;
            if (c[i] == '\n')
                lines++;
        }
        System.out.println(ch);
        System.out.println(vowels);
        System.out.println(words);
        System.out.println(lines);
    }
}
