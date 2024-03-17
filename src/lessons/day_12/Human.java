package lessons.day_12;

public class Human implements IRaceAble{
    private int speed;
    @Override
    public int speed() {
        this.speed = 15;
        return this.speed;
    }

    @Override
    public String toString() {
        return "Human{" +
                "speed=" + speed +
                '}';
    }
}
