package lessons.day_12.design_pattern;

public class BabyDuck extends Duck{
    public BabyDuck() {
        this.quackBehaviour = new Squeak();
    }
}
