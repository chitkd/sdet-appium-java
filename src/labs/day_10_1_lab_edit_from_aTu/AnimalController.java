package labs.day_10_1_lab_edit_from_aTu;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void findWinnerForRacing(List<AnimalWithBuilder> animalList){
        if (!animalList.isEmpty()){
            animalList = filterNonFlyableAnimal(animalList);
            if (!animalList.isEmpty()){
                int winnerSpeed = 0;
                AnimalWithBuilder winnerAnimal = animalList.get(0);
                for (AnimalWithBuilder animalWithBuilder : animalList) {
                    int currentAnimalSpeed = animalWithBuilder.getSpeed();
                    if(currentAnimalSpeed > winnerSpeed){
                        winnerSpeed = currentAnimalSpeed;
                        winnerAnimal = animalWithBuilder;
                    }
                }
                System.out.println("Winner is " + winnerAnimal.getName() + ", with speed: " + winnerAnimal.getSpeed());
            } else {
                System.out.println("All animals in the list are flyable so they can not join the racing animal!!!");
            }
        } else {
            System.out.println("The animal list is empty!!!");
        }
    }

    private static List<AnimalWithBuilder>  filterNonFlyableAnimal(List<AnimalWithBuilder> animalList){
        List<AnimalWithBuilder> filteredAnimalList = new ArrayList<AnimalWithBuilder>();
        for (AnimalWithBuilder animalWithBuilder : animalList) {
            if (!animalWithBuilder.isFlyable()){
                filteredAnimalList.add(animalWithBuilder);
            }
        }
        return filteredAnimalList;
    }
}
