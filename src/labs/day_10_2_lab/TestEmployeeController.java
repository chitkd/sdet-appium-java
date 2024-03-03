package labs.day_10_2_lab;


import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        Employee FTE1 = new FulltimeEmployee("001", "Lan");
        Employee FTE2 = new FulltimeEmployee("003", "Nam");
        Employee CTE1 = new ContractEmployee("002", "Yen");
        EmployeeController.calculateTotalSalary(Arrays.asList(FTE1, FTE2, CTE1));
    }
}
