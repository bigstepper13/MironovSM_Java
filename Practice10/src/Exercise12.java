import java.util.Scanner;
public class Exercise12 {
    public static void OddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
    public static void main(String[] args) {
        OddNumbers();
    }
}
