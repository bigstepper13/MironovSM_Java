public class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }

    public void move() {
        System.out.println("I am moving my leg.");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}