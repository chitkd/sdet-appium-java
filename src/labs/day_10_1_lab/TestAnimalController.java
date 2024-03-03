package labs.day_10_1_lab;

import java.util.Arrays;

public class TestAnimalController {
    public static void main(String[] args) {
        AnimalWithBuilder dog = new AnimalWithBuilder.Builder()
                .setFlyable(false)
                .setName("Dog")
                .setSpeed(56)
                .build();
        AnimalWithBuilder tiger = new AnimalWithBuilder.Builder()
                .setFlyable(false)
                .setSpeed(99)
                .setName("Tiger")
                .build();
        AnimalWithBuilder horse = new Horse.Builder()
                .setFlyable(false)
                .setSpeed(70)
                .setName("Horse")
                .build();
        AnimalWithBuilder falcon = new Falcon.Builder()
                .setFlyable(true)
                .setSpeed(146)
                .setName("Falcon")
                .build();
        AnimalWithBuilder eagle = new Eagle.Builder()
                .setFlyable(true)
                .setSpeed(150)
                .setName("Eagle")
                .build();
        AnimalWithBuilder snake = new AnimalWithBuilder.Builder()
                .setFlyable(false)
                .setSpeed(95)
                .setName("Snake")
                .build();
        AnimalController.findWinnerForRacing(Arrays.asList(dog, tiger, horse, eagle, falcon, snake));
    }
}
