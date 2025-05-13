import bai1.Student;
import bai2.Employee;
import bai3.Input;
import bai3.Printable;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a new Student object
        Student student = new Student("John Doe", 20);

        // Display the student's information
        student.display();

        // Update the student's name and age
        student.setName("Jane Doe");
        student.setAge(22);

        // Display the updated student's information
        student.display();

        // Create a new Employee object
        Employee employee = new Employee("Alice Smith", 30, 50000);
        employee.display();

        Input input = new Input();
        input.print();
    }
}
