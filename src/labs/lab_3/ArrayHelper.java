package labs.lab_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayHelper {
    public int[] inputAnArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the array length: ");
        int length = scanner.nextInt();
        if (length > 0){
            int[] integerArray = new int[length];
            for (int index = 0; index < length; index++) {
                System.out.println("Please input a number: ");
                integerArray[index] = scanner.nextInt();
            }
            return integerArray;
        } else {
            return null;
        }
    }

    public void  printAnArray(int[] integerArray){
        int length = integerArray.length;
        System.out.print("{");
        if (length > 0){
            if (length == 1){
                System.out.print(integerArray[0]);
            } else {
                for (int index = 0; index < length-1; index++) {
                    System.out.print(integerArray[index] + ", ");
                }
                System.out.print(integerArray[length - 1]);
            }
        }
        System.out.println("}");
    }

    public int findMin(int[] integerArray){
        int min = integerArray[0];
        for (int index = 0; index < integerArray.length; index++) {
            if (integerArray[index] < min){
                min = integerArray[index];
            }
        }
        return min;
    }

    public int findMax(int[] integerArray){
        int max = integerArray[0];
        for (int index = 0; index < integerArray.length; index++) {
            if (integerArray[index] > max){
                max = integerArray[index];
            }
        }
        return max;
    }

    public int[] sortArray(int[] integerArray){
        int length = integerArray.length;
        for (int index1 = 0; index1 < length - 1; index1++) {
            for (int index2 = index1; index2 < length ; index2++) {
                if (integerArray[index2] < integerArray[index1]){
                    int temp = integerArray[index1];
                    integerArray[index1] = integerArray[index2];
                    integerArray[index2] = temp;
                }
            }
        }
        return integerArray;
    }

    public int[] merge2SortedArrays(int[] integerArrayA, int[] integerArrayB){
        int lengthA = integerArrayA.length;
        int indexA = 0;
        int lengthB = integerArrayB.length;
        int indexB = 0;
        int[] resultList = new int[lengthA + lengthB];
        int indexResult = 0;
        while (indexA < lengthA && indexB < lengthB){
            if (integerArrayA[indexA] < integerArrayB[indexB]){
                resultList[indexResult++] = integerArrayA[indexA++];
            } else {
                resultList[indexResult++] = integerArrayB[indexB++];
            }
        }

        while (indexA < lengthA){
            resultList[indexResult++] = integerArrayA[indexA++];
        }

        while (indexB < lengthB){
            resultList[indexResult++] = integerArrayB[indexB++];
        }
        return resultList;
    }
}
