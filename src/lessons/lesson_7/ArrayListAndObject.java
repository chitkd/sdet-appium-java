package lessons.lesson_7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();
        RobotCat meomeo = new RobotCat("meomeo");
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);

        // Chnage the second's meomeo's name
        int SECOND_MEOMEO_INDEX = 1;
        robotCatList.get(SECOND_MEOMEO_INDEX).setName("Mimi");
        System.out.println(robotCatList);
    }
}
