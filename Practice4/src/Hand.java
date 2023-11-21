public class Hand {
    private int fingerCount;

    public Hand(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    public void move() {
        System.out.println("I am moving my hand.");
    }

    public int getFingerCount() {
        return fingerCount;
    }

    public void setFingerCount(int fingerCount) {
        this.fingerCount = fingerCount;
    }
}