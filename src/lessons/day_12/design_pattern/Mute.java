package lessons.day_12.design_pattern;

public class Mute implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I'm mute");
    }
}
