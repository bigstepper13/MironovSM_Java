public class ex1dowhile {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int i = 0;

        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);

        System.out.println("Сумма чисел массива: " + sum);
    }
}