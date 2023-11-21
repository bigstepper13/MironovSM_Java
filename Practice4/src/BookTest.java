public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Jack London", "Martin Eden", 1909);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());

        book.setAuthor("F. Scott Fitzgerald");
        book.setTitle("The Great Gatsby");
        book.setYear(1925);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());
    }
}