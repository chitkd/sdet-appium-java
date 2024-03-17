package lessons.day_12.design_pattern;

public class DuckTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MollardDuck();
        Duck babyDuck = new BabyDuck();

        mallardDuck.performQuack();
        babyDuck.performQuack();

        // Strategy Design pattern
    }
}
