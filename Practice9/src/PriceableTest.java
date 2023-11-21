public class PriceableTest {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(3000);
        System.out.println(l1.getPrice());

        Smartphone s1 = new Smartphone(1000);
        System.out.println(s1.getPrice());
    }
}