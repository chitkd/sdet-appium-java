package labs.day_10_1_lab_edit_from_aTu;

import java.security.SecureRandom;
import java.util.Arrays;

public class TestAnimalController {
    public static void main(String[] args) {
        final int DOG_MAX_SPEED = 60;
        final int TIGER_MAX_SPEED = 100;
        final int HORSE_MAX_SPEED = 75;
        AnimalWithBuilder dog = new AnimalWithBuilder.Builder()
                .setFlyable(false)
                .setSpeed(randomSpeed(DOG_MAX_SPEED))
                .setName("Dog")
                .build();
        AnimalWithBuilder tiger = new AnimalWithBuilder.Builder()
                .setFlyable(false)
                .setSpeed(randomSpeed(TIGER_MAX_SPEED))
                .setName("Tiger")
                .build();
        AnimalWithBuilder horse = new AnimalWithBuilder.Builder()
                .setFlyable(false)
                .setSpeed(randomSpeed(HORSE_MAX_SPEED))
                .setName("Horse")
                .build();
        AnimalWithBuilder falcon = new AnimalWithBuilder.Builder()
                .setFlyable(true)
                .setSpeed(146)
                .setName("Falcon")
                .build();
        AnimalWithBuilder eagle = new AnimalWithBuilder.Builder()
                .setFlyable(true)
                .setSpeed(150)
                .setName("Eagle")
                .build();
        AnimalWithBuilder snake = new AnimalWithBuilder.Builder()
                .setFlyable(false)
                .setSpeed(49)
                .setName("Snake")
                .build();
        AnimalController.findWinnerForRacing(Arrays.asList(dog, tiger, horse, eagle, falcon, snake));
    }

    private static int randomSpeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed) + 1;
    }
}
