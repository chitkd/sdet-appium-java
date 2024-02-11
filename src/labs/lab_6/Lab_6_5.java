package labs.lab_6;

import java.util.*;

public class Lab_6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String string = scanner.nextLine();
        System.out.println("Output: -->");
        printMapValues(countWords(string));
    }

    private static Map<String, Integer> countWords(String string) {
        Map<String, Integer> result = new HashMap<>();
        String removeNotAlphabet = string.replaceAll("[^a-zA-Z]", " ");
        String[] wordList = removeNotAlphabet.split(" ");
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList));

        for (String uniqueWord : wordSet) {
            int count = 0;
            if (uniqueWord.length() > 0) {
                for (String word : wordList) {
                    if (word.equals(uniqueWord)) {
                        count++;
                    }
                }
                result.put(uniqueWord, count);
            }
        }

        return result;
    }

    private static void printMapValues(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ": "+ map.get(key));
        }
    }

}
