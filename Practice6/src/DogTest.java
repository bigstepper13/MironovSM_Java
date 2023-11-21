public class DogTest {
    public static void main(String[] args) {
        Dalmatian Dalmatian = new Dalmatian(3);
        Bulldog bulldog = new Bulldog(5);

        System.out.println("Dalmatian breed: " + Dalmatian.getBreed());
        System.out.println("Dalmatian age: " + Dalmatian.getAge());

        System.out.println("Bulldog breed: " + bulldog.getBreed());
        System.out.println("Bulldog age: " + bulldog.getAge());

        Dalmatian.bark();
        bulldog.bark();
    }
}