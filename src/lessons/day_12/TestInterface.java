package lessons.day_12;

import java.util.Arrays;

public class TestInterface {
    public static void main(String[] args) {
        Animal lulu = new Animal();
        Human teo = new Human();

        IRaceAble winner = RaceController.getWinner(Arrays.asList(lulu, teo));
        System.out.println(winner);
    }
}
