package labs.day_08_lab.lab_7_2;

public class Dog extends Animal{
    private static final int MAX_SPEED = 60;

    public Dog() {
    }

    public Dog(String name) {
        super(name);
        this.setSpeed(randomSpeed(MAX_SPEED));
    }
}
