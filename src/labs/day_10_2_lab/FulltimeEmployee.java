package labs.day_10_2_lab;

public class FulltimeEmployee extends Employee {
    private static final int DEFAULT_SALARY = 50000;

    public FulltimeEmployee(String id, String name) {
        super(id, name);
        setDefaultSalary();
    }

    @Override
    void setDefaultSalary() {
        this.setSalary(DEFAULT_SALARY);
    }

}
