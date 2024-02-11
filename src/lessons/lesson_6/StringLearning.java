package lessons.lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLearning {
    public static void main(String[] args) {
        // Please filter numbers into an integer array
        List<Integer> numberFromStr = new ArrayList<>();
        String myString = "1256Asdfgj";
        char[] charArray = myString.toCharArray();
        System.out.println(Arrays.toString(charArray));

        for (char character : charArray) {
            if (Character.isDigit(character)){
                numberFromStr.add(Integer.valueOf(String.valueOf(character)));
                //System.out.printf("The %s is a number\n", character);
            } else if (Character.isLetter(character)){
                //System.out.printf("The %s is a character\n", character);
            }
        }

        System.out.println(numberFromStr);
    }
}
