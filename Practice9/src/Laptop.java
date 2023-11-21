public class Laptop implements Priceable {
    private int price;

    public Laptop(int price) { this.price = price; }

    @Override
    public int getPrice() { return price; }
}
