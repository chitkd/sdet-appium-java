package labs.day_10_1_lab_edit_from_aTu;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    private String name;
    private int speed;
    private boolean flyable;


    protected AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    protected int randomSpeed(int maxSpeed){
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
        return this.speed;
    }

    public static class Builder{
        private String name = "Animal";
        private int speed = 0;
        private boolean flyable = false;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }
    }
}
