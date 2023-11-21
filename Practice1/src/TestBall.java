public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        System.out.println(b1);
        Ball b2 = new Ball(5);
        System.out.println(b2);
        Ball b3 = new Ball("Red", 2);
        System.out.println(b3);
        System.out.println("Diametr of the ball = " + b3.getDiametr());
    }
}