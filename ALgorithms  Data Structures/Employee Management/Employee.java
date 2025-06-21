class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int id, String name, String pos, double sal) {
        this.employeeId = id;
        this.name = name;
        this.position = pos;
        this.salary = sal;
    }
}

class EmployeeManager {
    Employee[] employees = new Employee[100];
    int count = 0;

    public void addEmployee(Employee emp) {
        employees[count++] = emp;
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) return employees[i];
        }
        return null;
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                break;
            }
        }
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].name);
        }
    }
}
