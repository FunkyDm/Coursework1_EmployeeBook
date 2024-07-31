//Привести структуру проекта к ООП.
//Создать класс EmployeeBook;
//Перенести массив с сотрудниками в класс EmployeeBook, закрыть к нему доступ извне (сделать приватным);
//Все статические методы по работе с массивом перенести в этот класс и сделать не статическими;
//Добавить методы для управления внутренним массивом в EmployeeBook:
//Добавить нового сотрудника. (метод должен найти свободную ячейку в массиве и положить нового сотрудника в нее.
// Поиск свободных ячеек происходит с начала массива. Если свободных мест для сотрудника нет, то метод должен вернуть false,
// если для сотрудника нашлось место, то метод должен вернуть true)
//Удалить сотрудника (находим сотрудника по id, нуллим его ячейку в массиве);
//Добавить метод для получения сотрудника по id
//Инициализировать в методе main EmployeeBook и проверить корректность работы методов
public class EmployeeBook {
    private final Employee[] employees;

    private int size;

//    public EmployeeBook(Employee[] employees) {
//        this.employees = new Employee[size];
//    }

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }


    //    public Employee getEmployeeById(int id) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getEmployeeId() == id) {
//                return employees[i];
//            }
//        }
//        throw new RuntimeException("Работника с таким id не существует.");
//    }
//
//    public void addNewEmployee(String employeeName, int employeeDepartment, int employeeSalary) {
//        if (size >= employees.length) {
//            System.out.println("Невозможно добавить сотрудника. Нет места.");
//        }
//        Employee newEmployee = new Employee(employeeName, employeeDepartment, employeeSalary);
//        employees[size++] = newEmployee;
//    }

    public boolean addEmployee(String employeeName, int employeeDepartment, int employeeSalary){
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                employees[i] = new Employee(employeeName,employeeDepartment,employeeSalary);
                return true;
            }
        }
        return false;
    }

//    public boolean removeEmployee(){
//
//    }

    public void printAllEmployeesInfo() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public double monthSalaryCosts() {
        double sum = 0;
        for (Employee value : employees) {
            if (value != null) {
                sum += value.getEmployeeSalary();
            }
        }
        return sum;
    }

    public void searchEmployeeMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee value : employees) {
            if (maxSalaryEmployee.getEmployeeSalary() < value.getEmployeeSalary()) {
                maxSalaryEmployee = value;
            }
        }
        System.out.println("Данные сотрудника с максимальной зарплатой:\n" + maxSalaryEmployee);
    }

    public void searchEmployeeMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee value : employees) {
            if (minSalaryEmployee.getEmployeeSalary() > value.getEmployeeSalary()) {
                minSalaryEmployee = value;
            }
        }
        System.out.println("Данные сотрудника с минимальной зарплатой:\n" + minSalaryEmployee);
    }

    public double searchEmployeeAverageSalary() {
        return monthSalaryCosts() / employees.length;
    }

    public void printAllEmployeesFullNames() {
        System.out.println("\nСписок всех ФИО сотрудников:");
        for (Employee value : employees) {
            System.out.println(value.getEmployeeName());
        }
    }

    public void indexingSalary(double index) {
        index = index / 100;
        for (Employee value : employees) {
            value.setEmployeeSalary(value.getEmployeeSalary() * (1 + index));
        }
    }

    public void searchEmployeeDepMinSalary(int employeeDep) {
        Employee minSalaryEmployee = null;
        for (Employee value : employees) {
            if (value.getEmployeeDepartment() == employeeDep) {
                minSalaryEmployee = value;
                break;
            }
        }
        for (Employee value : employees) {
            if (value.getEmployeeDepartment() == employeeDep && (minSalaryEmployee != null ? minSalaryEmployee.getEmployeeSalary() : 0) > value.getEmployeeSalary()) {
                minSalaryEmployee = value;
            }
        }
        System.out.println("Данные сотрудника с минимальной зарплатой в отделе " + employeeDep + " :\n" + minSalaryEmployee);
    }

    public void searchEmployeeDepMaxSalary(int employeeDep) {
        Employee maxSalaryEmployee = null;
        for (Employee value : employees) {
            if (value.getEmployeeDepartment() == employeeDep) {
                maxSalaryEmployee = value;
                break;
            }
        }
        for (Employee value : employees) {
            if (value.getEmployeeDepartment() == employeeDep && (maxSalaryEmployee != null ? maxSalaryEmployee.getEmployeeSalary() : 0) < value.getEmployeeSalary()) {
                maxSalaryEmployee = value;
            }
        }
        System.out.println("Данные сотрудника с максимальной зарплатой в отделе " + employeeDep + " :\n" + maxSalaryEmployee);
    }


    public double depMonthSalaryCosts(int employeeDep) {
        double sum = 0;
        for (Employee value : employees) {
            if (value != null && value.getEmployeeDepartment() == employeeDep) {
                sum += value.getEmployeeSalary();
            }
        }
        return sum;
    }

    public double searchEmployeeDepAverageSalary(int employeeDep) {
        int depCount = 0;
        for (Employee value : employees) {
            if (value.getEmployeeDepartment() == employeeDep) {
                depCount++;
            }
        }
        if (depCount == 0) {
            throw new RuntimeException("В отделе нет людей");
        } else {
            return depMonthSalaryCosts(employeeDep) / depCount;
        }
    }

    public void printAllDepEmployeesInfo(int employeeDep) {
        for (Employee value : employees) {
            if (value.getEmployeeDepartment() == employeeDep) {
                System.out.println("Id: " + value.getEmployeeId() + "\nФИО: " + value.getEmployeeName() + "\nЗарплата: " + value.getEmployeeSalary() + "\n");
            }
        }
    }

    public void depIndexingSalary(double index, int employeeDep) {
        index = index / 100;
        for (Employee value : employees) {
            if (value.getEmployeeDepartment() == employeeDep) {
                value.setEmployeeSalary(value.getEmployeeSalary() * (1 + index));
            }
        }
    }

    public void printEmployeesSalaryLessThenNum(double num) {
        for (Employee value : employees) {
            if (value.getEmployeeSalary() < num) {
                System.out.println("Id: " + value.getEmployeeId() + "\nФИО: " + value.getEmployeeName() + "\nЗарплата: " + value.getEmployeeSalary() + "\n");
            }
        }
    }

    public void printEmployeesSalaryHigherThenNum(double num) {
        for (Employee value : employees) {
            if (value.getEmployeeSalary() > num) {
                System.out.println("Id: " + value.getEmployeeId() + "\nФИО: " + value.getEmployeeName() + "\nЗарплата: " + value.getEmployeeSalary() + "\n");
            }
        }
    }
}
