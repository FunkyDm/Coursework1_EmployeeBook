public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        EmployeeBook employeeBook1 = new EmployeeBook(employees);

        employeeBook1.addEmployee("Долгов Андрей Александрович", 1, 120_000);
        employeeBook1.addEmployee("Винтовой Станислав Алексеевич", 3, 50_000);
        employeeBook1.addEmployee("Лютых Александр Александрович", 1, 110_000);
        employeeBook1.addEmployee("Ивлев Павел Николаевич", 5, 140_000);
        employeeBook1.addEmployee("Максимов Сергей Анатольевич", 1, 120_000);
        employeeBook1.addEmployee("Шибаев Алексей Алексеевич", 3, 59_000);
        employeeBook1.addEmployee("Анисимов Аркадий Валерьвич", 4, 100_000);
        employeeBook1.addEmployee("Анисимов Константин Валерьевич", 4, 100_000);
        employeeBook1.addEmployee("Серьезный Семен Семенович", 2, 90_000);
        employeeBook1.addEmployee("Смоленцева Екатерина Александровна", 2, 90_000);

        System.out.println("\nПроверяем метод printAllEmployeesInfo");
        employeeBook1.printAllEmployeesInfo();

        employeeBook1.removeEmployee(1);
        employeeBook1.removeEmployee(2);
        employeeBook1.removeEmployee(3);
        employeeBook1.removeEmployee(4);
        employeeBook1.removeEmployee(5);
        employeeBook1.removeEmployee(6);
        employeeBook1.removeEmployee(7);
        employeeBook1.removeEmployee(8);
        employeeBook1.removeEmployee(9);
        employeeBook1.removeEmployee(10);

        System.out.println("\nПроверяем метод printAllEmployeesInfo");
        employeeBook1.printAllEmployeesInfo();

        employeeBook1.addEmployee("Долгов Андрей Александрович", 1, 120_000);
        employeeBook1.addEmployee("Винтовой Станислав Алексеевич", 3, 50_000);
        employeeBook1.addEmployee("Лютых Александр Александрович", 1, 110_000);
        employeeBook1.addEmployee("Ивлев Павел Николаевич", 5, 140_000);
        employeeBook1.addEmployee("Максимов Сергей Анатольевич", 1, 120_000);
        employeeBook1.addEmployee("Шибаев Алексей Алексеевич", 3, 59_000);
        employeeBook1.addEmployee("Анисимов Аркадий Валерьвич", 4, 100_000);
        employeeBook1.addEmployee("Анисимов Константин Валерьевич", 4, 100_000);
        employeeBook1.addEmployee("Серьезный Семен Семенович", 2, 90_000);
        employeeBook1.addEmployee("Смоленцева Екатерина Александровна", 2, 90_000);

        System.out.println("\nПроверяем метод printAllEmployeesInfo");
        employeeBook1.printAllEmployeesInfo();

//        System.out.println("\nПроверяем метод monthSalaryCosts");
//        System.out.println(employeeBook1.monthSalaryCosts());
//        System.out.println("\nПроверяем метод searchEmployeeMaxSalary");
//        employeeBook1.searchEmployeeMaxSalary();
//        System.out.println("\nПроверяем метод searchEmployeeMinSalary");
//        employeeBook1.searchEmployeeMinSalary();
//        System.out.println("\nПроверяем метод searchEmployeeAverageSalary");
//        System.out.println(employeeBook1.searchEmployeeAverageSalary());
//        System.out.println("\nПроверяем метод printAllEmployeesFullNames");
//        employeeBook1.printAllEmployeesFullNames();
//        System.out.println("\nПроверяем метод indexingSalary");
//        employeeBook1.indexingSalary(4);
//        employeeBook1.printAllEmployeesInfo();
//        System.out.println("\nПроверяем метод searchEmployeeDepMinSalary");
//        employeeBook1.searchEmployeeDepMinSalary(1);
//        System.out.println("\nПроверяем метод searchEmployeeDepMaxSalary");
//        employeeBook1.searchEmployeeDepMaxSalary(1);
//        System.out.println("\nПроверяем метод depMonthSalaryCosts");
//        System.out.println(employeeBook1.depMonthSalaryCosts(1));
//        System.out.println("\nПроверяем метод searchEmployeeDepAverageSalary");
//        System.out.println(employeeBook1.searchEmployeeDepAverageSalary(1));
//        System.out.println("\nПроверяем метод printAllDepEmployeesInfo");
//        employeeBook1.printAllDepEmployeesInfo(1);
//        System.out.println("\nПроверяем метод depIndexingSalary");
//        employeeBook1.depIndexingSalary(4,1);
//        employeeBook1.printAllDepEmployeesInfo(1);
//        System.out.println("\nПроверяем метод printEmployeesSalaryLessThenNum");
//        employeeBook1.printEmployeesSalaryLessThenNum(130000);
//        System.out.println("\nПроверяем метод printEmployeesSalaryHigherThenNum");
//        employeeBook1.printEmployeesSalaryHigherThenNum(60000);

    }
}