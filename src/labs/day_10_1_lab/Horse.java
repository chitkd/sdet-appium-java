package labs.day_10_1_lab;

public class Horse extends AnimalWithBuilder {
    private static final int MAX_SPEED = 75;

    protected Horse(Builder builder) {
        super(builder);
        builder.setSpeed(randomSpeed(MAX_SPEED));
    }
}
