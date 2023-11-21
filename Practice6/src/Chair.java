public class Chair extends Furniture {
    private int numOfLegs;

    public Chair(String name, double price, int numOfLegs) {
        super(name, price);
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() { return numOfLegs; }

    @Override
    public void displayInfo() {
        System.out.println("Chair: " + getName() + ", Price: " + getPrice() + ", Number of legs: " + numOfLegs);
    }
}