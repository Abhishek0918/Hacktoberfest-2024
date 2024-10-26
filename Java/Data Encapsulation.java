// A class to demonstrate data encapsulation
class Employee {
    // Private fields to ensure data encapsulation
    private String name;
    private int age;
    private double salary;

    // Public constructor to initialize Employee object
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter methods to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods to modify private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    // A method to display Employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee("John Doe", 30, 50000);

        // Displaying employee details using encapsulated data
        emp1.displayEmployeeDetails();

        // Modifying employee's salary using a setter method
        emp1.setSalary(55000);

        // Accessing and displaying modified employee details
        System.out.println("\nAfter salary update:");
        emp1.displayEmployeeDetails();
    }
}
