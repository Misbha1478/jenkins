public class Employee {
    // Employee attributes
    private int empId;
    private String name;
    private String department;
    private int salary;
    private String address;
    private String email;

    // Constructor to initialize employee details
    public Employee(int empId, String name, String department, int salary, String address, String email) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.address = address;
        this.email = email;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        // Creating an EmployeeDetails object with sample data
        Employee employee = new Employee(
                101,
                "Emma Watson",
                "IT",
                15000,
                "New Delhi",
                "emmawatson123@gmail.com"
        );

        // Displaying the employee details
        employee.displayEmployeeDetails();
    }
}

