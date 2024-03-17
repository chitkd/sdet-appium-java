package lessons.day_12.design_pattern;

public class MollardDuck extends Duck{
    public MollardDuck() {
        this.quackBehaviour = new Quack();
    }
}
