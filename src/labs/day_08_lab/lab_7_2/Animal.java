package labs.day_08_lab.lab_7_2;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected int randomSpeed(int maxSpeed){
        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
        return this.speed;
    }
}
