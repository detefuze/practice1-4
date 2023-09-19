package ru.mirea.kabo0222.practice3.formatirovanie.task3;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee a = new Employee("Kane", 1100);
        Employee b = new Employee("Pole", 2000);
        Employee c = new Employee("Mark", 3500);
        Employee[] employees = {a,b,c};
        Report.generate_report(employees);
    }
}
