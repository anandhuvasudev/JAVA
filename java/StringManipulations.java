import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        System.out.println("Length of the string: " + length);

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        if (length >= 3) {
            System.out.println("Substring (first 3 chars): " + str.substring(0, 3));
        } else {
            System.out.println("Substring: " + str);
        }

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
