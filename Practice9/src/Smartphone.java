public class Smartphone implements Priceable {
    private int price;

    public Smartphone(int price) { this.price = price; }

    @Override
    public int getPrice() { return price; }
}

