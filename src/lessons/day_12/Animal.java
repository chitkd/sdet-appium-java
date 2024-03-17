package lessons.day_12;

public class Animal implements IRaceAble, IRunAble{
    private int speed;
    @Override
    public int speed() {
        this.speed = 15;
        return this.speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public int stepLength() {
        return 15;
    }
}
