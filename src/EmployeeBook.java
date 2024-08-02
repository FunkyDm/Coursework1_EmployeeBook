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
    private Employee[] employees;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    private int findEmployeeAmount() {
        int amount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                amount++;
            }
        }
        return amount;
    }

    public boolean addEmployee(String employeeName, int employeeDepartment, int employeeSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(employeeName, employeeDepartment, employeeSalary);
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(int id) {
        for (int i = id - 1; i < employees.length; i++) {
            if (employees[i].getEmployeeId() == id) {
                employees[i] = null;
            }
        }
        //throw new RuntimeException("Работника с id " + id + " не существует.");
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == id) {
                return employee;
            }
        }
        throw new RuntimeException("Работника с таким id не существует.");
    }

    public void printAllEmployeesInfo() {
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public double monthSalaryCosts() {
        double sum = 0;
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                sum += employees[i].getEmployeeSalary();
            }
        }
        return sum;
    }

    public void searchEmployeeMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (maxSalaryEmployee.getEmployeeSalary() < employees[i].getEmployeeSalary()) {
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        System.out.println("Данные сотрудника с максимальной зарплатой:\n" + maxSalaryEmployee);
    }

    public void searchEmployeeMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (minSalaryEmployee.getEmployeeSalary() > employees[i].getEmployeeSalary()) {
                    minSalaryEmployee = employees[i];
                }
            }
        }
        System.out.println("Данные сотрудника с минимальной зарплатой:\n" + minSalaryEmployee);
    }

    public double searchEmployeeAverageSalary() {
        return monthSalaryCosts() / findEmployeeAmount();
    }

    public void printAllEmployeesFullNames() {
        System.out.println("\nСписок всех ФИО сотрудников:");
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getEmployeeName());
            }
        }
    }

    public void indexingSalary(double index) {
        index = index / 100;
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                employees[i].setEmployeeSalary(employees[i].getEmployeeSalary() * (1 + index));
            }
        }
    }

    public void searchEmployeeDepMinSalary(int employeeDep) {
        Employee minSalaryEmployee = null;
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeDepartment() == employeeDep) {
                    minSalaryEmployee = employees[i];
                    break;
                }
            }
        }
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeDepartment() == employeeDep && (minSalaryEmployee != null ? minSalaryEmployee.getEmployeeSalary() : 0) > employees[i].getEmployeeSalary()) {
                    minSalaryEmployee = employees[i];
                }
            }
        }
        System.out.println("Данные сотрудника с минимальной зарплатой в отделе " + employeeDep + " :\n" + minSalaryEmployee);
    }

    public void searchEmployeeDepMaxSalary(int employeeDep) {
        Employee maxSalaryEmployee = null;
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeDepartment() == employeeDep) {
                    maxSalaryEmployee = employees[i];
                    break;
                }
            }
        }
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeDepartment() == employeeDep && (maxSalaryEmployee != null ? maxSalaryEmployee.getEmployeeSalary() : 0) < employees[i].getEmployeeSalary()) {
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        System.out.println("Данные сотрудника с максимальной зарплатой в отделе " + employeeDep + " :\n" + maxSalaryEmployee);
    }


    public double depMonthSalaryCosts(int employeeDep) {
        double sum = 0;
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDep) {
                sum += employees[i].getEmployeeSalary();
            }
        }
        return sum;
    }

    public double searchEmployeeDepAverageSalary(int employeeDep) {
        int depCount = 0;
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeDepartment() == employeeDep) {
                    depCount++;
                }
            }
        }
        if (depCount == 0) {
            throw new RuntimeException("В отделе нет людей");
        } else {
            return depMonthSalaryCosts(employeeDep) / depCount;
        }
    }

    public void printAllDepEmployeesInfo(int employeeDep) {
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeDepartment() == employeeDep) {
                    System.out.println("Id: " + employees[i].getEmployeeId() + "\nФИО: " + employees[i].getEmployeeName() + "\nЗарплата: " + employees[i].getEmployeeSalary() + "\n");
                }
            }
        }
    }

    public void depIndexingSalary(double index, int employeeDep) {
        index = index / 100;
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeDepartment() == employeeDep) {
                    employees[i].setEmployeeSalary(employees[i].getEmployeeSalary() * (1 + index));
                }
            }
        }
    }

    public void printEmployeesSalaryLessThenNum(double num) {
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeSalary() < num) {
                    System.out.println("Id: " + employees[i].getEmployeeId() + "\nФИО: " + employees[i].getEmployeeName() + "\nЗарплата: " + employees[i].getEmployeeSalary() + "\n");
                }
            }
        }
    }

    public void printEmployeesSalaryHigherThenNum(double num) {
        for (int i = 0; i < findEmployeeAmount(); i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeSalary() > num) {
                    System.out.println("Id: " + employees[i].getEmployeeId() + "\nФИО: " + employees[i].getEmployeeName() + "\nЗарплата: " + employees[i].getEmployeeSalary() + "\n");
                }
            }
        }
    }
}
