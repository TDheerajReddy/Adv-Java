// Q1. Create a class for Employee and print employee details.
import java.util.*;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    String department;
    String role;
    Employee(String Name, int Age, String Department, String Role) {
        name = Name;
        age = Age;
        department = Department;
        role = Role;
    }
}

class EmployeeHandler {

    static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void display() {
        for(Employee employee : employees) {
            System.out.println(employee.name +" | "+ employee.age +" | "+ employee.department +" | "+ employee.role);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number of employees");
            int n = sc.nextInt();
            sc.nextLine();

            for(int i = 1; i <= n; i++) {
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Department: ");
                String department = sc.nextLine();
                System.out.print("Enter Employee Role: ");
                String role = sc.nextLine();
            
                employees.add(new Employee(name, age, department, role));
            }
            display();
        } catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}