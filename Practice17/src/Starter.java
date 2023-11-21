import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Юрчихин", 100, 1, 19));
        s.add(new Student("Миронов", 100, 1, 19));
        s.add(new Student("Балахонцева", 99, 3, 19));
        s.add(new Student("Ушакова", 99, 7, 20));
        s.add(new Student("Матюхин", 110, 3, 19));

        new LabClassUI(s);
    }
}