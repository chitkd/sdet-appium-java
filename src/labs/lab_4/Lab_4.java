package labs.lab_4;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        List<Integer> randomArrayList = generateAnArrayList(1000);
        boolean isContinuing = true;
        do {
            printGameMenu();
            System.out.println("=> Please input your selection: ");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    printAllNumbers(randomArrayList);
                    break;
                case 2:
                    System.out.println("The maximum number from array list: " + findMax(randomArrayList));
                    break;
                case 3:
                    System.out.println("The minimum number from array list: " + findMin(randomArrayList));
                    break;
                case 4:
                    searchNumberFromAnArray(randomArrayList);
                    break;
                default:
                    isContinuing = false;
            }
        } while (isContinuing);
    }

    private static void printGameMenu() {
        System.out.println("=====MENU=====\n" +
                "1. Print all numbers\n" +
                "2. Print maximum value\n" +
                "3. Print minimum value\n" +
                "4. Search number");
    }

    private static List<Integer> generateAnArrayList(int upperBound) {
        List<Integer> integerList = new ArrayList<>();
        SecureRandom random = new SecureRandom();
        int length = random.nextInt(upperBound) + 1;
        for (int index = 0; index < length-1; index++) {
            integerList.add(random.nextInt(upperBound));
        }
        return integerList;
    }

    private static void printAllNumbers(List<Integer> arrayList){
        System.out.println("All the numbers that we have in the array list: " + arrayList);
    }

    private static int findMax(List<Integer> arrayList){
        int max = arrayList.get(0);
        if (arrayList.size() > 1){
            for (int index = 1; index < arrayList.size(); index++) {
                if (arrayList.get(index) > max){
                    max = arrayList.get(index);
                }
            }
        }
        return max;
    }

    private static int findMin(List<Integer> arrayList){
        int min = arrayList.get(0);
        if (arrayList.size() > 1){
            for (int index = 1; index < arrayList.size(); index++) {
                if (arrayList.get(index) < min){
                    min = arrayList.get(index);
                }
            }
        }
        return min;
    }

    private static void searchNumberFromAnArray(List<Integer> arrayList){
        System.out.println("Please input a number to search: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> searchIndex = searchNumber(arrayList, number);
        if (searchIndex.size() > 0){
            System.out.println(number + " is existing in arraylist and its index: " + searchIndex);
        }
        else {
            System.out.println(number + " is not in the list");
        }
    }
    private static List<Integer> searchNumber(List<Integer> arrayList, int number){
        List<Integer> indexList = new ArrayList<>();
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index).equals(number)){
                indexList.add(index);
            }
        }
        return indexList;
    }

}
