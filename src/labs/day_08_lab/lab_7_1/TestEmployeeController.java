package labs.day_08_lab.lab_7_1;


import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        Employee FTE1 = new FulltimeEmployee("001", "Lan");
        Employee FTE2 = new FulltimeEmployee("003", "Nam");
        Employee CTE1 = new ContractEmployee("002", "Yen");
        Employee CTE2 = new ContractEmployee("004", "Cuc");
        Employee CTE3 = new ContractEmployee("007", "Thien");
        EmployeeController.calculateTotalSalary(Arrays.asList(FTE1, FTE2, CTE1, CTE2, CTE3));
    }
}
