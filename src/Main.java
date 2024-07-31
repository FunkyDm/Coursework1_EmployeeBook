public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook1 = new EmployeeBook(new Employee[10]);

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
        System.out.println("\nПроверяем метод monthSalaryCosts");
        System.out.println(employeeBook1.monthSalaryCosts());
//        System.out.println("\nПроверяем метод searchEmployeeMaxSalary");
//        searchEmployeeMaxSalary();
//        System.out.println("\nПроверяем метод searchEmployeeMinSalary");
//        searchEmployeeMinSalary();
//        System.out.println("\nПроверяем метод searchEmployeeAverageSalary");
//        System.out.println(searchEmployeeAverageSalary());
//        System.out.println("\nПроверяем метод printAllEmployeesFullNames");
//        printAllEmployeesFullNames();
//        System.out.println("\nПроверяем метод indexingSalary");
//        indexingSalary(4);
//        printAllEmployeesInfo();
//        System.out.println("\nПроверяем метод searchEmployeeDepMinSalary");
//        searchEmployeeDepMinSalary(1);
//        System.out.println("\nПроверяем метод searchEmployeeDepMaxSalary");
//        searchEmployeeDepMaxSalary(1);
//        System.out.println("\nПроверяем метод depMonthSalaryCosts");
//        System.out.println(depMonthSalaryCosts(1));
//        System.out.println("\nПроверяем метод searchEmployeeDepAverageSalary");
//        System.out.println(searchEmployeeDepAverageSalary(1));
//        System.out.println("\nПроверяем метод printAllDepEmployeesInfo");
//        printAllDepEmployeesInfo(1);
//        System.out.println("\nПроверяем метод depIndexingSalary");
//        depIndexingSalary(4,1);
//        printAllDepEmployeesInfo(1);
//        System.out.println("\nПроверяем метод printEmployeesSalaryLessThenNum");
//        printEmployeesSalaryLessThenNum(130000);
//        System.out.println("\nПроверяем метод printEmployeesSalaryHigherThenNum");
//        printEmployeesSalaryHigherThenNum(60000);

    }
}