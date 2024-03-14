class Library{
    String [] books;
    int no_of_books;
    public Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    public void addBook(String bookName){
        this.books[no_of_books] = bookName;
        this.no_of_books++;
        System.out.println(bookName+" has been added.");
    }

    public String issueBook(String bookName){
        for (int i=0; i<this.no_of_books; i++){
            if (this.books[i].equals(bookName)){
                System.out.println(bookName + " has been issued!!");
                this.books[i] = null;
                return bookName;
            }
        }
        return "Book Not Found!!";

    }

    public void showAvailableBooks(){
        System.out.println("--------------------");
        for (int i=0; i<this.no_of_books; i++){
            if (this.books[i] != null){
                System.out.println(this.books[i]);
            }
        }
    }

    public void returnBook(String bookName){
        for (int i=0; i<100; i++){
            if (this.books[i] == null){
                books[i] = bookName;
                System.out.println("Book has been returned.");
                break;
            }
        }
    }
}

public class Library_System {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("RICH DAD AND POOR DAD!!");
        library.addBook("NEW DELHI");
        library.addBook("EAST SUN");
        library.addBook("SUGAR CANDY");
        library.showAvailableBooks();
        System.out.println(library.issueBook("EAST SUN"));
        System.out.println(library.issueBook("NEW DELHI"));
        library.showAvailableBooks();
        library.returnBook("EAST SUN");
        library.returnBook("NEW DELHI");
        library.showAvailableBooks();
    }
}