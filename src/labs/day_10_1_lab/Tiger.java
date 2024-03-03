package labs.day_10_1_lab;

public class Tiger extends AnimalWithBuilder {
    private static final int MAX_SPEED = 100;

    public Tiger(Builder builder) {
        super(builder);
        builder.setSpeed(randomSpeed(MAX_SPEED));
    }
}
