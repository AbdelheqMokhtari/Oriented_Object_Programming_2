import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Reader {
    private String name;
    private String ID;
    private List<Book> borrowedBooks = new LinkedList<>();

    public Reader(String name) {
        this.name = name;
        Random random = new Random();
        this.ID = String.format("%06d", random.nextInt(1000000));
    }

    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        // Check if the book is present in the borrowedBooks list
        if (!borrowedBooks.contains(book)) {
            System.out.println("Book '" + book.getTitle() + "' not found in your borrowed books.");
            return;
        }

        // Remove the book from the borrowedBooks list
        borrowedBooks.remove(book);
        System.out.println("Book '" + book.getTitle() + "' returned successfully.");
    }
    public void printBorrowedBook(){
        for(int i=0; i<borrowedBooks.size(); i++){
            System.out.println(i + "- " + borrowedBooks.get(i).getTitle() + ", " +borrowedBooks.get(i).getAuthor() + ", ISBN : " +
                    borrowedBooks.get(i).getISBN());

        }
    }
}
