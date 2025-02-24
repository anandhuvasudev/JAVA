import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    void displayPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}

class Book extends Publisher {
    String bookTitle;
    String authorName;


    Book(String publisherName, String bookTitle, String authorName) {
        super(publisherName);
        this.bookTitle = bookTitle;
        this.authorName = authorName;
    }

    void displayBook() {
        displayPublisher();
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + authorName);
    }
}

class Literature extends Book {
    String genre;

    Literature(String publisherName, String bookTitle, String authorName, String genre) {
        super(publisherName, bookTitle, authorName);
        this.genre = genre;
    }

    void display() {
        System.out.println("\n[Literature Book Details]");
        displayBook();
   System.out.println("Genre: " + genre);
    }
}

class Fiction extends Book {
    String category;

    Fiction(String publisherName, String bookTitle, String authorName, String category) {
        super(publisherName, bookTitle, authorName);
        this.category = category;
    }

    void display() {
        System.out.println("\n[Fiction Book Details]");
        displayBook();
        System.out.println("Category: " + category);
    }
}

public class BookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Literature book:");
        System.out.print("Publisher Name: ");
        String pub1 = sc.nextLine();
        System.out.print("Book Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author Name: ");
        String author1 = sc.nextLine();
        System.out.print("Genre: ");
        String genre = sc.nextLine();

        System.out.println("\nEnter details for Fiction book:");
        System.out.print("Publisher Name: ");
        String pub2 = sc.nextLine();
        System.out.print("Book Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author Name: ");
        String author2 = sc.nextLine();
        System.out.print("Category: ");
        String category = sc.nextLine();

        Literature litBook = new Literature(pub1, title1, author1, genre);
        Fiction ficBook = new Fiction(pub2, title2, author2, category);

        litBook.display();
        ficBook.display();

        sc.close();
    }
}
