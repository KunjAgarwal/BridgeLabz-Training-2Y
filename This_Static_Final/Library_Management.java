public class Library_Management {

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");
        Book book2 = new Book("1984", "George Orwell", "978-0-452-28423-4");

        System.out.println("--- Book Details ---");
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
        System.out.println("--- Instanceof Check ---");
        Object anObject = book1;
        if (anObject instanceof Book) {
            Book book = (Book) anObject;
            System.out.println("Object is an instance of Book. Displaying details:");
            book.displayDetails();
        } else {
            System.out.println("Object is not an instance of Book.");
        }
        System.out.println();
        Book.displayLibraryName();
    }
}
class Book {
    private static String libraryName = "City Central Library";
    private final String isbn;
    private String title;
    private String author;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}
