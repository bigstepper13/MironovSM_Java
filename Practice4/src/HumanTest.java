public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Brown", 2);
        Leg leftLeg = new Leg(100);
        Leg rightLeg = new Leg(100);
        Hand leftHand = new Hand(5);
        Hand rightHand = new Hand(5);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        human.walk();
        human.wave();
        head.talk();
    }
}