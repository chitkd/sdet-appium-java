package labs.day_10_2_lab;

import java.util.List;

public class EmployeeController {
    public static void calculateTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        System.out.println("The total Employee's salary is: " + totalSalary);
    }
}
