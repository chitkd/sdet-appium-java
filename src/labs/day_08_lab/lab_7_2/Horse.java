package labs.day_08_lab.lab_7_2;

public class Horse extends Animal {
    private static final int MAX_SPEED = 75;

    public Horse() {
    }

    public Horse(String name) {
        super(name);
        this.setSpeed(randomSpeed(MAX_SPEED));
    }
}
