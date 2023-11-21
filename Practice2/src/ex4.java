import java.util.Arrays;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        // Генерируем массив случайных чисел
        int[] array = generateRandomArray(10, -100, 100);

        // Выводим исходный массив на экран
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Сортируем массив
        Arrays.sort(array);

        // Выводим отсортированный массив на экран
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
}