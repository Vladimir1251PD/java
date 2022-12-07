package src.ru.mirea.task3;

import java.util.Date;

class Employee {
    private String fullname;
    private float salary;
    public Employee(String name, float sal) {
        fullname = name;
        salary = sal;
    }
    @Override
    public String toString() {
        String inf = String.format("%-10s %10.2f %n", fullname, salary);
        return inf;
    }
}

class Report {
    static void generateReport(Employee[] emp) {
        Date nowDate = new Date();
        System.out.printf("Отчёт (%tc)%n", nowDate);
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toString());
        }
    }
}
    class EmployeeReport {
        public static void main(String[] args) {
            Employee[] reportList = new Employee[3];
            reportList[0] = new Employee("Ivan", 300000);
            reportList[1] = new Employee("Yaroslav", 96705.76f);
            reportList[2] = new Employee("Daniel", 34500.903f);
            Report.generateReport(reportList);
        }
    }




