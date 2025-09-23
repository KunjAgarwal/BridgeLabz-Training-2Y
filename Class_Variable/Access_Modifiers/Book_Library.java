class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("Format: " + format);
    }
}

public class Book_Library {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Java Programming", "Kunj Agarwal", "PDF");
        ebook.displayDetails();

        ebook.setAuthor("Riya Sharma");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
