package labs.day_10_1_lab;

public class Dog extends AnimalWithBuilder {
    private static final int MAX_SPEED = 60;

    public Dog(Builder builder) {
        super(builder);
        builder.setSpeed(randomSpeed(MAX_SPEED));
    }
}
