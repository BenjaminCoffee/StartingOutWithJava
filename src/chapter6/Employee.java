package chapter6;

public class Employee {
    private String name;
    private String department;
    private String position;
    private int idNumber;

    // Added as part of programming challenge #6
    public Employee(String name, String department, String position, int idNumber) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.idNumber = idNumber;
    }

    // Added as part of programming challenge #6
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    // Added as part of programming challenge #6
    public Employee() {
        this.name = "";
        this.department = "";
        this.position = "";
        this.idNumber = 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
