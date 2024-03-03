package labs.day_10_2_lab;

public class ContractEmployee extends Employee {
    private static final int DEFAULT_SALARY = 40000;

    public ContractEmployee() {
    }

    public ContractEmployee(String id, String name) {
        super(id, name);
        setDefaultSalary();
    }

    @Override
    void setDefaultSalary() {
        this.setSalary(DEFAULT_SALARY);
    }

}
