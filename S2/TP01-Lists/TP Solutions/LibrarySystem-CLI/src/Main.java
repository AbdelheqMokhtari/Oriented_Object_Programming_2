import java.util.List;
import java.util.Scanner;

public class Main {
    static Library library = new Library();
    static Scanner scanner = new Scanner(System.in);
    public static void addingBookMenu(){
        String title;
        String author;
        String yearPublished;
        String genre;
        System.out.println("************** Adding Book **************");
        System.out.print("Book Name : ");
        title = scanner.nextLine();
        System.out.print("Author Name : ");
        author = scanner.nextLine();
        System.out.print("year published : ");
        yearPublished = scanner.nextLine();
        System.out.print("Genre : ");
        genre = scanner.nextLine();
        char choice;
        do {
            System.out.println("do you want to add this book (y/n)");
            choice = scanner.next().charAt(0);
        }while((choice != 'y') && (choice != 'n'));
        if(choice == 'y'){
            Book book = new Book(title,author,yearPublished,genre);
            library.addBook(book);
        }
        do {
            System.out.println("do you want to add another book (y/n)");
            choice = scanner.next().charAt(0);
        }while((choice != 'y') && (choice != 'n'));
        if(choice == 'y'){
            addingBookMenu();
        }
        else{
            displayMenu();
        }

    }

    public static void addingReaderMenu(){
        String fullName;
        System.out.println("************** Adding Reader **************");
        System.out.print("Full Name : ");
        fullName = scanner.nextLine();
        char choice;
        do {
            System.out.println("do you want to add this Reader (y/n)");
            choice = scanner.next().charAt(0);
        }while((choice != 'y') && (choice != 'n'));
        if(choice == 'y'){
            Reader reader = new Reader(fullName);
            library.addReader(reader);
        }
        do {
            System.out.println("do you want to add another Reader (y/n)");
            choice = scanner.next().charAt(0);
        }while((choice != 'y') && (choice != 'n'));
        if(choice == 'y'){
            addingReaderMenu();
        }
        else{
            displayMenu();
        }

    }
    public static void borrowUsingName(Reader reader){
        System.out.println("************** BorrowBook Using Name **************");
        System.out.print("Enter the name of the Book you want to borrow : " );
        String name = scanner.nextLine();
        Book book = library.searchBook(name);
        if(book != null){
            library.borrowBook(reader,book);
            displayMenu();
        }
        else{
            System.out.println("Book doesn't exist");
            borrowBook();
        }

    }
    public static void returnUsingName(Reader reader){
        System.out.println("************** ReturnBook Using Name **************");
        System.out.print("Enter the name of the Book you want to return : " );
        String name = scanner.nextLine();
        Book book = library.searchBook(name);
        if(book != null){
            library.returnBook(reader,book);
            displayMenu();
        }
        else{
            System.out.println("Book doesn't exist");
            returnBook();
        }

    }
    public static void borrowUsingISBN(Reader reader){
        System.out.println("************** BorrowBook Using ISBN **************");
        System.out.print("Enter the ISBN of the Book you want to borrow : " );
        String ISBN = scanner.nextLine();
        Book book = library.searchBookISBN(ISBN);
        if(book != null){
            library.borrowBook(reader,book);
            displayMenu();
        }
        else{
            System.out.println("Book doesn't exist");
            borrowBook();
        }

    }

    public static void returnUsingISBN(Reader reader){
        System.out.println("************** BorrowBook Using ISBN **************");
        System.out.print("Enter the ISBN of the Book you want to borrow : " );
        String ISBN = scanner.nextLine();
        Book book = library.searchBookISBN(ISBN);
        if(book != null){
            library.returnBook(reader,book);
            displayMenu();
        }
        else{
            System.out.println("Book doesn't exist");
            returnBook();
        }

    }
    public static void borrowBook(){
        int number;
        System.out.println("************** BorrowBook **************");
        System.out.print("Reader Name : ");
        String readerName = scanner.nextLine();
        if(library.readerExist(readerName)){
            Reader reader = library.searchReader(readerName);
            System.out.println("1- Using Book Name");
            System.out.println("2- Using ISBN");
            do {
                System.out.println("Select the number : ");
                number = scanner.nextInt();

            }while((number < 1) || (number > 2));
            switch (number) {
                case 1:
                    borrowUsingName(reader);
                    break;
                case 2:
                    borrowUsingISBN(reader);
                    break;
            }
        }
        else{
            System.out.println("this reader doesn't exist Type any button to continue ...");
            displayMenu();
        }
    }

    public static void returnBook(){
        int number;
        System.out.println("************** Return Book **************");
        System.out.print("Reader Name :  ");
        String readerName = scanner.nextLine();
        if(library.readerExist(readerName)){
            Reader reader = library.searchReader(readerName);
            System.out.println("1- Using Book Name");
            System.out.println("2- Using ISBN");
            do {
                System.out.println("Select the number : ");
                number = scanner.nextInt();

            }while((number < 1) || (number > 2));
            switch (number) {
                case 1:
                    returnUsingName(reader);
                    break;
                case 2:
                    returnUsingISBN(reader);
                    break;
            }
        }
        else{
            System.out.println("this reader doesn't exist Type any button to continue ...");
            displayMenu();
        }
    }
    public static void searchBookMenu(){
        System.out.println("************** Search Book **************");
        System.out.print("enter the name of a book : ");
        String name = scanner.nextLine();
        Book book = library.searchBook(name);
        if(book == null){
            System.out.println("there is no book with such name!");
        }
        else{
            book.bookInformation();
        }

    }
    public static void listOfReaderMenu(){
        int number;
        System.out.println("************** List of Readers **************");
        library.listReader();
        if(library.readerListSize() == 0){
            System.out.println("the List is empty, Press any button to continue ... ");
            scanner.next().charAt(0);
            displayMenu();
        }
        else {
            do {
                System.out.println("Select the Reader : ");
                number = scanner.nextInt();
            } while (number >= library.bookListSize());
            List<Reader> readers = library.getReaderList();
            System.out.println("************** Reader Details **************");
            System.out.println("Reader Name : " + readers.get(number).getName());
            System.out.println("Reader ID   : " + readers.get(number).getID());
            System.out.println("List of his borrowed books : ");
            readers.get(number).printBorrowedBook();
            displayMenu();
        }
    }
    public static void listOfBooksMenu(){
        System.out.println("************** List of Books **************");
        library.listAvailableBooks();
        System.out.println("Type any button to continue");
        displayMenu();
    }


    public static void displayMenu(){
        int number;
        System.out.println("************** Main Menu **************");
        System.out.println("1- Add a Book");
        System.out.println("2- Add a Reader ");
        System.out.println("3- Borrow a Book");
        System.out.println("4- Return a Book");
        System.out.println("5- Search Book");
        System.out.println("6- List of Readers");
        System.out.println("7- List of Books");
        System.out.println("8- Exit");
        do {
            System.out.print("Select the number : ");
            number = scanner.nextInt();

        }while ((number < 1) || (number > 8));
        switch (number){
            case 1:
                addingBookMenu();
                break;
            case 2:
                addingReaderMenu();
                break;
            case 3:
                borrowBook();
                break;
            case 4:
                returnBook();
                break;
            case 5:
                searchBookMenu();
                break;
            case 6:
                listOfReaderMenu();
                break;
            case 7:
                listOfBooksMenu();
                break;
            case 8:
                System.exit(0);
                break;
        }

    }
    public static void main(String[] args) {
        displayMenu();
    }
}