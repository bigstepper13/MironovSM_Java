public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        System.out.println(b1);
        Ball b2 = new Ball();
        b2.setXY(6.4, 8.5);
        System.out.println(b2);
        Ball b3 = new Ball();
        b3.move(13, -6);
        System.out.println(b3);
    }
}