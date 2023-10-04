public class Employee {
    private int cnic;
    private String name;
    private int salary;

    public Employee (){
        System.out.println("no argument constructor called");
    }

    Employee (int cnic, String name){
        this.cnic=cnic;
        this.name=name;
    }

    public Employee(int cnic, String name, int salary){
        this(cnic, name);
        this.salary=salary;
    }
    public void setCnic(int cnic){
        this.cnic=cnic;
    }
    public int getCnic(){
        return cnic;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }

}
