public class Table extends Furniture {
    private int numOfSeats;

    public Table(String name, double price, int numOfSeats) {
        super(name, price);
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() { return numOfSeats; }

    @Override
    public void displayInfo() {
        System.out.println("Table: " + getName() + ", Price: " + getPrice() + ", Number of seats: " + numOfSeats);
    }
}