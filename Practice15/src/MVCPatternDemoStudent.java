public class MVCPatternDemoStudent {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new
                StudentController(model, view);
        controller.updateView();
        controller.setStudentRollNo("13");
        System.out.println("\nAfter updating, Student Deatails are as follows");
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("George");
        student.setRollNo("777");
        return student;
    }
}