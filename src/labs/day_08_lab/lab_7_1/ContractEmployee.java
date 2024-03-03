package labs.day_08_lab.lab_7_1;

public class ContractEmployee extends Employee{
    private static final int DEFAULT_SALARY = 40000;

    public ContractEmployee() {
    }

    public ContractEmployee(String id, String name) {
        super(id, name);
        this.setSalary(DEFAULT_SALARY);
    }
}
