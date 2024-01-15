package labs.lab_2_1;

import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {
        /*
        Underweight = <18.5
        Normal weight = 18.5 – 24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height(m): ");
        double height = scanner.nextDouble();
        System.out.println("Please input your weight(kg): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        double differentWeight;
        if (bmi < 18.5){
            differentWeight = (height * height) * 18.5 - weight;
            System.out.printf("You are underweight and need to increase your weight by %.2f",  differentWeight);
        } else if (bmi < 24.9) {
            System.out.println("You are normal");
        } else if (bmi < 29.9) {
            differentWeight = weight - (height * height) * 24.9;
            System.out.printf("You are overweight and need to decrease your weight by %.2f", differentWeight);
        } else {
            differentWeight = weight - (height * height) * 24.9;
            System.out.printf("You are obesity and need to decrease your weight by %.2f", differentWeight);
        }
    }
}
