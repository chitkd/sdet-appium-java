package labs.lab_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_6_3 {
    public static void main(String[] args) {
        String myStr = inputString();
        extractDigitCharacterFromString(myStr);
    }

    private static void extractDigitCharacterFromString(String myStr) {
        char[] charArray = myStr.toCharArray();
        List<String> numberList = new ArrayList<>();
        for (char character : charArray) {
            if (Character.isDigit(character)){
                numberList.add(character + "");
            }
        }

        if (numberList.isEmpty()){
            System.out.println("There is no digit character in the given string!");
        } else {
            System.out.println("The digit character is in the list: " + String.join("", numberList));
        }
    }

    private static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string:");
        return scanner.nextLine();
    }
}

