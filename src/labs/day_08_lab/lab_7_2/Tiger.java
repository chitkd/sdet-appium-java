package labs.day_08_lab.lab_7_2;

public class Tiger extends Animal{
    private static final int MAX_SPEED = 100;

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
        this.setSpeed(randomSpeed(MAX_SPEED));
    }
}
