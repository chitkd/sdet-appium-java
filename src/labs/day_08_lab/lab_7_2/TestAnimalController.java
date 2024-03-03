package labs.day_08_lab.lab_7_2;

import java.util.Arrays;

public class TestAnimalController {
    public static void main(String[] args) {
        Animal horse = new Horse("Horse");
        Animal dog = new Dog("Dog");
        Animal tiger = new Tiger("Tiger");
        AnimalController.findWinnerForRacing(Arrays.asList(horse, dog, tiger));
    }
}
