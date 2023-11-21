public class Exercise15 {
    public static void DigitsReverse(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            System.out.println(number % 10);
            DigitsReverse(number / 10);
        }
    }
    public static void main(String[] args) {
        int number = 12345;
        DigitsReverse(number);
    }
}
