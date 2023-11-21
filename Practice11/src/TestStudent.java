import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student (1, "George", 5),
                new Student(24, "Gosha", 2),
                new Student(5, "Aboba", 16),
                new Student(87, "Georgy", 1)
        };

        System.out.println("Before sorting: ");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
        // сортировка вставкой по idNumber
        for (int i = 1; i < students.length; i++) {
            for (int j = i; (j > 0) && (students[j - 1].compareTo(students[j]) > 0); j--) {
                Student temp = students[j];
                students[j] = students[j - 1];
                students[j - 1] = temp;
            }
        }
        System.out.println("After sorting by idNumber: ");
        for (Student s : students) {
            System.out.println(s);
        }

        // быстрая сортировка по GPA
        System.out.println();
        qSort(students, students.length-1, 0);

        System.out.println("After sorting by GPA: ");
        for (Student s : students) {
            System.out.println(s);
        }
        // слияние
        System.out.println();
        Student[] students2 = new Student[] {
                new Student(38, "Willow", 7),
                new Student(90, "Apex", 1),
                new Student(16, "Henry", 16),
                new Student(100, "Patrick", 100)
        };
        Student[] allStudents = new Student[students.length + students2.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students2, 0, allStudents,students.length, students2.length);
        mergeSort(allStudents, allStudents.length);

        System.out.println("After merge sorting: ");
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    private  static StudentComparator comparator = new StudentComparator();

    public static void qSort(Object[] students, int high, int low) {
        if (students == null || students.length == 0) return;
        if (high <= low) return;

        Object middle = students[(low + high) / 2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> equal = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (comparator.compare(students[i], middle) > 0)
                right.add(students[i]);
            else if (comparator.compare(students[i], middle) < 0)
                left.add(students[i]);
            else equal.add(students[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if (left.size() > 0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, students, low, left.size());
        }
        System.arraycopy(equal.toArray(), 0, students, low + left.size(), equal.size());
        if (right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, students, low + left.size() + equal.size(), right.size());
        }
    }
}
