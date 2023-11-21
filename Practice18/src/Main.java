public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        integers[0] = 13; integers[1] = 23; integers[2] = 38; integers[3] = 99; integers[4] = 69;
        integers[5] = 12; integers[6] = 98; integers[7] = 31; integers[8] = 123; integers[9] = 19;
        Double od = 43.2;
        MinMax<Integer> minmax = new MinMax<>(integers);
        System.out.println(minmax.min());
        System.out.println(minmax.max());
        System.out.println(Calculator.multiply(100,15));
        Number[][] matrix01 = new Integer[2][2];
        Number[][] matrix02 = new Double[2][2];
        Number[][] matrix0r = new Double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix01[i][j] = integers[i*2+j];
                //matrix02[i][j] = integers[4 + i*2+j];
                matrix02[i][j] = od;
                matrix0r[i][j] = 0.0;
            }
        }
        Matrix matrix1 = new Matrix(matrix01);
        Matrix matrix2 = new Matrix(matrix02);
        Matrix matrixr = new Matrix(matrix0r);
        matrix1.subtraction(matrix2,matrixr);
        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrixr);
        System.out.println(matrixr.det());
    }
}