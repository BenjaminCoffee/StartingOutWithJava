package chapter6;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee employee0 = new Employee();

        Employee employee1 = new Employee(
                "Billy",
                "Sales",
                "Associate",
                8675);

        Employee employee2 = new Employee(
                "Christina",
                309);

        System.out.println(employee0.toString());
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
