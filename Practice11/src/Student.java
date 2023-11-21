public class Student implements Comparable<Student>{
    private int idNumber;
    private String name;
    private int GPA;

    public Student(int idNumber, String name, int GPA) {
        this.idNumber = idNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getidNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student: idNumber = " + idNumber + ", name = " + name + ", GPA = " + GPA;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        if (this.idNumber == anotherStudent.idNumber){
            return 0;
        }
        else if (this.idNumber < anotherStudent.idNumber) {
            return -1;
        }
        else {
            return 1;
        }
    }
}