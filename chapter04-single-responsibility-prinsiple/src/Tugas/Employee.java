package Tugas;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Methods to manage employee data
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to print employee salary report
    public void printSalaryReport() {
        System.out.println("Employee Salary Report");
        System.out.println("----------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
