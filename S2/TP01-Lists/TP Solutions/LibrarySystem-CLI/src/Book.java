import java.util.Random;

public class Book {
    private String title;
    private String author;
    private String yearPublished;
    private String genre;
    private boolean isAvailable = true;
    private String ISBN;

    public Book(String title, String author, String yearPublished, String genre) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;
        Random random = new Random();
        this.ISBN = String.format("%07d", random.nextInt(10000000));
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void bookInformation(){
        System.out.println("Title : " + this.title + "\nAuthor : " + this.author + "\nYear Published" + this.yearPublished +
                "\ngenre" +this.genre);
    }
}
