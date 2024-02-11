package lessons.lesson_5;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(3, 6, 0, 3, 9, -3));
        myList.add(-3);

        // Using Set to remove duplication and sort
        Set<Integer> mySet = new HashSet<>(myList);
        System.out.println("Set: " + mySet);
    }
}
