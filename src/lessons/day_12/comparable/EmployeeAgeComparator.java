package lessons.day_12.comparable;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee thisEmployee, Employee thatEmployee) {
        return thisEmployee.getAge() - thatEmployee.getAge();
    }
}
