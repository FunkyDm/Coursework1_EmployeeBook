public class Main {

    static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Долгов Андрей Александрович", 1, 120_000);
        employee[1] = new Employee("Винтовой Станислав Алексеевич", 3, 50_000);
        employee[2] = new Employee("Лютых Александр Александрович", 1, 110_000);
        employee[3] = new Employee("Ивлев Павел Николаевич", 5, 140_000);
        employee[4] = new Employee("Максимов Сергей Анатольевич", 1, 120_000);
        employee[5] = new Employee("Шибаев Алексей Алексеевич", 3, 59_000);
        employee[6] = new Employee("Анисимов Аркадий Валерьвич", 4, 100_000);
        employee[7] = new Employee("Анисимов Константин Валерьевич", 4, 100_000);
        employee[8] = new Employee("Серьезный Семен Семенович", 2, 90_000);
        employee[9] = new Employee("Смоленцева Екатерина Александровна", 2, 90_000);

        System.out.println("\nПроверяем метод printAllEmployeesInfo");
        printAllEmployeesInfo();

        System.out.println("\nПроверяем метод monthSalaryCosts");
        System.out.println(monthSalaryCosts());

        System.out.println("\nПроверяем метод searchEmployeeMaxSalary");
        searchEmployeeMaxSalary();

        System.out.println("\nПроверяем метод searchEmployeeMinSalary");
        searchEmployeeMinSalary();

        System.out.println("\nПроверяем метод searchEmployeeAverageSalary");
        System.out.println(searchEmployeeAverageSalary());

        System.out.println("\nПроверяем метод printAllEmployeesFullNames");
        printAllEmployeesFullNames();

    }

    static void printAllEmployeesInfo() {
        for (int i = 0; i < 10; i++) {
            System.out.println(employee[i].toString());
        }
    }

    static int monthSalaryCosts() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getEmployeeSalary();
            }
        }
        return sum;
    }

    static void searchEmployeeMaxSalary() {
        Employee maxSalaryEmployee = employee[0];
        for (Employee value : employee) {
            if (maxSalaryEmployee.getEmployeeSalary() < value.getEmployeeSalary()) {
                maxSalaryEmployee = value;
            }
        }
        System.out.println("Данные сотрудника с максимальной зарплатой:\n" + maxSalaryEmployee);
    }

    static void searchEmployeeMinSalary() {
        Employee minSalaryEmployee = employee[0];
        for (Employee value : employee) {
            if (minSalaryEmployee.getEmployeeSalary() > value.getEmployeeSalary()) {
                minSalaryEmployee = value;
            }
        }
        System.out.println("Данные сотрудника с минимальной зарплатой:\n" + minSalaryEmployee);
    }

    static double searchEmployeeAverageSalary() {
        return (double) monthSalaryCosts() / employee.length;
    }

    static void printAllEmployeesFullNames() {
        System.out.println("\nСписок всех ФИО сотрудников:");
        for (Employee value : employee) {
            System.out.println(value.getEmployeeName());
        }
    }

}