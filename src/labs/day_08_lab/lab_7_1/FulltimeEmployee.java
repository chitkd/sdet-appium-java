package labs.day_08_lab.lab_7_1;

public class FulltimeEmployee extends Employee{
    private static final int DEFAULT_SALARY = 50000;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(String id, String name) {
        super(id, name);
        this.setSalary(DEFAULT_SALARY);
    }
}
