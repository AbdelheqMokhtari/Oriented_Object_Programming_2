import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Book> bookList = new LinkedList<>();
    private List <Reader> readerList = new LinkedList<>();

    public int bookListSize(){
        return bookList.size();
    }

    public List<Reader> getReaderList() {
        return readerList;
    }

    public int readerListSize(){
        return readerList.size();
    }
    public void addBook(Book book){
        bookList.add(book);
    }

    public void addReader(Reader reader){
        readerList.add(reader);
    }

    public void borrowBook(Reader reader,Book book){
        reader.borrowBook(book);
    }

    public void returnBook(Reader reader, Book book){
        if (reader.getBorrowedBooks().contains(book)) {
            reader.returnBook(book);
        }
        else {
            System.out.println("the user doesn't have this Book");
        }
    }

    public Book searchBook(String bookTitle){
        for (Book book : bookList) {
            if (book.getTitle().equals(bookTitle)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookISBN(String ISBN){
        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    public Reader searchReader(String readerName){
        for (Reader reader : readerList) {
            if (reader.getName().equals(readerName)) {
                return reader;
            }
        }
        return null;
    }
    public boolean readerExist(String readersName){
        for (Reader reader : readerList) {
            System.out.println("Reader Name : " + reader.getName());
            if (reader.getName().equals(readersName)) {
                return true;
            }
        }
        return false;
    }

    public void listReader(){

        for(int i=0; i<readerList.size(); i++){
            System.out.println(i + "- " + readerList.get(i).getName()+", ID =  "+readerList.get(i).getID());

        }

    }
    public void listAvailableBooks(){
        for(int i=0; i<bookList.size(); i++){
            System.out.println(i + "- " + bookList.get(i).getTitle() + ", " +bookList.get(i).getAuthor() + ", ISBN : " +
                    bookList.get(i).getISBN());

        }
    }
}
