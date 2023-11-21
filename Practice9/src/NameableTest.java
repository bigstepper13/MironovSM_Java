public class NameableTest {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars");
        System.out.println(mars.getName());

        Car bmw = new Car("BMW");
        System.out.println(bmw.getName());
    }
}