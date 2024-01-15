package labs.lab_2_2;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        System.out.println("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.printf("%d is an even number", number);
        } else {
            System.out.printf("%d is an odd number", number);
        }
    }
}
