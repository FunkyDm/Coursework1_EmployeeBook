public class Employee {

    private final String employeeName;

    private int employeeDepartment;

    private double employeeSalary;

    public static int idCounter = 1;

    private int employeeId;

    public Employee(String employeeName, int employeeDepartment, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
        this.employeeId = idCounter++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeDepartment(int employeeDepartment) {
        if (employeeDepartment < 1 || employeeDepartment > 5) {
            System.out.println("Мы работаем с 5 отделами. Введите число от 1 до 5.");
            return;
        }
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeSalary(double employeeSalary) {
        if (employeeSalary <= 0) {
            System.out.println("Введите неотрицательное число больше нуля для зарплаты сотрудника.");
            return;
        }
        this.employeeSalary = employeeSalary;
    }

    public void reduceIdByOne(Employee employee){
        employee.employeeId--;
    }

    @Override
    public String toString() {
        return "Id: " + employeeId + "\nФИО: " + employeeName + "\nОтдел: " + employeeDepartment + "\nЗарплата: " + employeeSalary + "\n";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass() || other == null) return false;
        Employee employee = (Employee) other;
        return employeeName.equals(employee.employeeName) && employeeDepartment == employee.employeeDepartment
                && employeeSalary == employee.employeeSalary
                && employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(employeeId, employeeName, employeeDepartment, employeeSalary);
    }

}
