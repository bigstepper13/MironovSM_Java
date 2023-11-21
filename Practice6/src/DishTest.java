public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", "White", 10);
        Cup cup = new Cup("Glass", "Blue", 250);

        System.out.println("Plate material: " + plate.getMaterial());
        System.out.println("Plate color: " + plate.getColor());
        System.out.println("Plate diameter: " + plate.getDiameter());

        System.out.println("Cup material: " + cup.getMaterial());
        System.out.println("Cup color: " + cup.getColor());
        System.out.println("Cup volume: " + cup.getVolume());

        plate.wash();
        cup.wash();
    }
}