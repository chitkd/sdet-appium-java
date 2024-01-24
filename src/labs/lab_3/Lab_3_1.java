package labs.lab_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_3_1 {
    public static void main(String[] args) {
        int[] integerArray = new ArrayHelper().inputAnArray();

        int oddCount = 0;
        int evenCount = 0;
        int length = integerArray.length;
        for (int index = 0; index < length; index++) {
            if (integerArray[index] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
