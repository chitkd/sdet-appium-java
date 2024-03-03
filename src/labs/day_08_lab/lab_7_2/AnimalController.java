package labs.day_08_lab.lab_7_2;

import java.util.List;

public class AnimalController {
    public static void findWinnerForRacing(List<Animal> animalList){
        int winnerSpeed = 0;
        Animal winnerAnimal = null;
        if (!animalList.isEmpty()){
            for (Animal animal : animalList) {
                int currentAnimalSpeed = animal.getSpeed();
                if(currentAnimalSpeed > winnerSpeed){
                    winnerSpeed = currentAnimalSpeed;
                    winnerAnimal = animal;
                }
            }
            System.out.println("Winner is " + winnerAnimal.getName() + ", with speed: " + winnerAnimal.getSpeed());
        } else {
            System.out.println("The animal list is empty!!!");
        }


    }
}
