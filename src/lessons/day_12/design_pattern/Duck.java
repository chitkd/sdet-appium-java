package lessons.day_12.design_pattern;

public class Duck {
    protected IQuackBehaviour quackBehaviour;
    protected IFlyBehaviour flyBehaviour;

    protected void performQuack(){
        quackBehaviour.quack();
    }

    protected void performFly(){
        flyBehaviour.fly();
    }
}
