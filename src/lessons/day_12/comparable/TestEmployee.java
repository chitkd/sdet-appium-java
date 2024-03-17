package lessons.day_12.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        Employee teo = new Employee("teo", 20, 21);
        Employee ty = new Employee("ty", 30, 32);
        Employee tun = new Employee("tun", 10, 13);

        List<Employee> employeeList = Arrays.asList(teo, ty, tun);
        System.out.println("BEFORE SORTING");
        System.out.println(employeeList);

        System.out.println("AFTER SORTING");
        Collections.sort(employeeList);
        System.out.println(employeeList);

        System.out.println("SORT BY NAME");
        employeeList.sort(new EmployeeNameComparator());
        System.out.println(employeeList);

        System.out.println("SORT BY AGE");
        employeeList.sort(new EmployeeAgeComparator());
        System.out.println(employeeList);
    }
}
