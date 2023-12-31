public class Book {
    private String name, author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.year = 0;
    }
    public Book() {
        this.name = "default ";
        this.author = "default";
        this.year = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return this.name + this.author + ", year " + this.year;
    }
}