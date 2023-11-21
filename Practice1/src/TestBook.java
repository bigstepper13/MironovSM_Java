public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println(b1);
        Book b2 = new Book("Silence ", "R.J. Barret", 2005);
        System.out.println(b2);
        Book b3 = new Book("Red ", "A.A. Alexandrov");
        System.out.println(b3);
    }
}