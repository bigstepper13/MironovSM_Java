import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println(number + "!" + " = " + factorial);
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}