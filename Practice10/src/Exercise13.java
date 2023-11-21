import java.util.Scanner;
public class Exercise13 {
    public static void OddNumbers_v2() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 1;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (count % 2 != 0) {
                System.out.print(number + " ");
            }

            count++;
        }
    }
    public static void main(String[] args) {
        OddNumbers_v2();
    }
}
