public class ex1while {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int i = 0;

        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        System.out.println("Сумма чисел массива: " + sum);
    }
}