package lessons.day_12.design_pattern;

public class Quack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}
