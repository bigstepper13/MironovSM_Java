public class Exercise14 {
    public static void Digits(int number) {
        if (number < 10) {
            System.out.println(number);
        }
        else {
            Digits(number / 10);
            System.out.println(number % 10);
        }
    }
    public static void main(String[] args) {
        int number = 12345;
        Digits(number);
    }
}
