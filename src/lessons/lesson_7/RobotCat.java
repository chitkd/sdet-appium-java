package lessons.lesson_7;

public class RobotCat {
    private String name;
    public RobotCat() {
    }

    // Overloading constructor
    public RobotCat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
