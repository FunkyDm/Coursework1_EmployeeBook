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

//        System.out.println("\nПроверяем метод printAllEmployeesInfo");
//        printAllEmployeesInfo();
//
//        System.out.println("\nПроверяем метод monthSalaryCosts");
//        System.out.println(monthSalaryCosts());
//
//        System.out.println("\nПроверяем метод searchEmployeeMaxSalary");
//        searchEmployeeMaxSalary();
//
//        System.out.println("\nПроверяем метод searchEmployeeMinSalary");
//        searchEmployeeMinSalary();
//
//        System.out.println("\nПроверяем метод searchEmployeeAverageSalary");
//        System.out.println(searchEmployeeAverageSalary());
//
//        System.out.println("\nПроверяем метод printAllEmployeesFullNames");
//        printAllEmployeesFullNames();
//
//        System.out.println("\nПроверяем метод indexingSalary");
//        indexingSalary(4);
//        printAllEmployeesInfo();
//
//        System.out.println("\nПроверяем метод searchEmployeeDepMinSalary");
//        searchEmployeeDepMinSalary(1);
//
//        System.out.println("\nПроверяем метод searchEmployeeDepMaxSalary");
//        searchEmployeeDepMaxSalary(1);
//
//        System.out.println("\nПроверяем метод depMonthSalaryCosts");
//        System.out.println(depMonthSalaryCosts(1));
//
//        System.out.println("\nПроверяем метод searchEmployeeDepAverageSalary");
//        System.out.println(searchEmployeeDepAverageSalary(1));
//
//        System.out.println("\nПроверяем метод printAllDepEmployeesInfo");
//        printAllDepEmployeesInfo(1);
//
//        System.out.println("\nПроверяем метод depIndexingSalary");
//        depIndexingSalary(4,1);
//        printAllDepEmployeesInfo(1);
//
//        System.out.println("\nПроверяем метод printEmployeesSalaryLessThenNum");
//        printEmployeesSalaryLessThenNum(130000);
//
//        System.out.println("\nПроверяем метод printEmployeesSalaryHigherThenNum");
//        printEmployeesSalaryHigherThenNum(60000);

    }

    static void printAllEmployeesInfo() {
        for (int i = 0; i < 10; i++) {
            System.out.println(employee[i].toString());
        }
    }

    static double monthSalaryCosts() {
        double sum = 0;
        for (Employee value : employee) {
            if (value != null) {
                sum += value.getEmployeeSalary();
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
        return monthSalaryCosts() / employee.length;
    }

    static void printAllEmployeesFullNames() {
        System.out.println("\nСписок всех ФИО сотрудников:");
        for (Employee value : employee) {
            System.out.println(value.getEmployeeName());
        }
    }

    static void indexingSalary(double index){
        index = index / 100;
        for (Employee value : employee) {
            value.setEmployeeSalary(value.getEmployeeSalary() * (1 + index));
        }
    }

    static void searchEmployeeDepMinSalary(int employeeDep){
        Employee minSalaryEmployee = null;
        for(Employee value : employee){
            if(value.getEmployeeDepartment() == employeeDep){
                minSalaryEmployee = value;
                break;
            }
        }
        for(Employee value : employee){
            if(value.getEmployeeDepartment() == employeeDep && (minSalaryEmployee != null ? minSalaryEmployee.getEmployeeSalary() : 0) > value.getEmployeeSalary()){
                minSalaryEmployee = value;
            }
        }
        System.out.println("Данные сотрудника с минимальной зарплатой в отделе " + employeeDep + " :\n" + minSalaryEmployee);
    }

    static void searchEmployeeDepMaxSalary(int employeeDep){
        Employee maxSalaryEmployee = null;
        for(Employee value : employee){
            if(value.getEmployeeDepartment() == employeeDep){
                maxSalaryEmployee = value;
                break;
            }
        }
        for(Employee value : employee){
            if(value.getEmployeeDepartment() == employeeDep && (maxSalaryEmployee != null ? maxSalaryEmployee.getEmployeeSalary() : 0) < value.getEmployeeSalary()){
                maxSalaryEmployee = value;
            }
        }
        System.out.println("Данные сотрудника с максимальной зарплатой в отделе " + employeeDep + " :\n" + maxSalaryEmployee);
    }


    static double depMonthSalaryCosts(int employeeDep) {
        double sum = 0;
        for (Employee value : employee) {
            if (value != null && value.getEmployeeDepartment() == employeeDep) {
                sum += value.getEmployeeSalary();
            }
        }
        return sum;
    }

    static double searchEmployeeDepAverageSalary(int employeeDep) {
        int depCount = 0;
        for(Employee value : employee){
            if(value.getEmployeeDepartment() == employeeDep){
                depCount++;
            }
        }
        if(depCount == 0){
            throw new RuntimeException("В отделе нет людей");
        }
        else{
            return depMonthSalaryCosts(employeeDep) / depCount;
        }
    }

    static void printAllDepEmployeesInfo(int employeeDep) {
        for (Employee value : employee) {
            if(value.getEmployeeDepartment() == employeeDep){
                System.out.println("Id: " + value.getEmployeeId() + "\nФИО: " + value.getEmployeeName() + "\nЗарплата: " + value.getEmployeeSalary() + "\n");
            }
        }
    }

    static void depIndexingSalary(double index, int employeeDep){
        index = index / 100;
        for (Employee value : employee) {
            if(value.getEmployeeDepartment() == employeeDep){
                value.setEmployeeSalary(value.getEmployeeSalary() * (1 + index));
            }
        }
    }

    static void printEmployeesSalaryLessThenNum(double num){
        for(Employee value : employee){
            if(value.getEmployeeSalary() < num){
                System.out.println("Id: " + value.getEmployeeId() + "\nФИО: " + value.getEmployeeName() + "\nЗарплата: " + value.getEmployeeSalary() + "\n");
            }
        }
    }

    static void printEmployeesSalaryHigherThenNum(double num){
        for(Employee value : employee){
            if(value.getEmployeeSalary() > num){
                System.out.println("Id: " + value.getEmployeeId() + "\nФИО: " + value.getEmployeeName() + "\nЗарплата: " + value.getEmployeeSalary() + "\n");
            }
        }
    }

}