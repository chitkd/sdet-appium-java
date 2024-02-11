package lessons.lesson_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        // CRUD
        Map<Integer, String> emergencyList = new HashMap<>();
        // Adding a new entry into a map (
        emergencyList .put(113, "CSCD");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(116, "Others");

        System.out.println(emergencyList.get(116));

        // Read one value
        emergencyList.put(116, "Something else");
        System.out.println(emergencyList.get(116));

        // Update
        emergencyList.replace(116, "ABC");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116, "ABC", "XYZ");
        System.out.println(emergencyList.get(116));

        // Remove/ Delete an entry out of the map
        emergencyList.remove(116, "123");
        System.out.println("After removing: " + emergencyList.get(116));
        System.out.println("=========");

        // Loop over the map
        emergencyList.put(116, "Others");
        printMapValues(emergencyList);


        Set<Integer> keys = emergencyList.keySet();
        for (Integer key : keys) {
            System.out.println(emergencyList.get(key));
        }

        // Loop over the entries, if the entry has value "Others" -> remove from the map
        System.out.println("=== Loop over the entries, if the entry has.....======)");

        printMapValues(emergencyList);

    }

    private static void printMapValues(Map<Integer, String> map) {
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
    }
}
