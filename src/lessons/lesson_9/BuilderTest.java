package lessons.lesson_9;
import static lessons.lesson_9.HouseWithBuilder.Builder;
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        HouseWithBuilder house = builder
                .setColor("Green")
                .setMainDoors(2)
                .setTopRoof("blue")
                .setWindows(9)
                .build();
        // Framework consumer
    }
}
