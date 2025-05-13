package bai2;

public class Employee extends Person {

    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: $" + salary);
    }

}