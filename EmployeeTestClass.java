public class EmployeeTestClass {
    public static void main(String args []) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(35201, "sara");
        Employee e3 = new Employee(35202, "justin", 45000);

        System.out.println("employee 1: cnic=" + e1.getCnic() + "  name=" + e1.getName() + "  salary=" + e1.getSalary());
        System.out.println("employee 2: cnic=" + e2.getCnic() + "  name=" + e2.getName() + "  salary=" + e2.getSalary());
        System.out.println("employee 3: cnic=" + e3.getCnic() + "  name=" + e3.getName() + "  salary=" + e3.getSalary());
    }
}