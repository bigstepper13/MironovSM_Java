public class MVCPatternDemoEmployee {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new
                EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeSalary("1300000");
        System.out.println("\nAfter updating, Employee Details are as follows");
        controller.updateView();
    }
    private static Employee retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Nikita");
        employee.setSalary("300000");
        return employee;
    }
}