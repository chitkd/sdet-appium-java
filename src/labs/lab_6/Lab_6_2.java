package labs.lab_6;

import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        String myPassword = "Pass1234";
        int maxGuessTimes = 3;
        guessPassword(myPassword,  maxGuessTimes);
    }

    private static void guessPassword(String myPassword, int maxGuessTimes) {
        boolean isContinuing = false;
        int guessTimes = 0;
        Scanner scanner = new Scanner(System.in);
        while (guessTimes < maxGuessTimes && !isContinuing){
            System.out.println("Please input your guessing password:");
            String guessingPassword = scanner.nextLine();
            if (guessingPassword.equals(myPassword)){
                System.out.println("Hooray! You have correctly guessed the password.");
                break;
            } else {
                guessTimes++;
            }
        }

        if (guessTimes == 3){
            System.out.println("Game over!");
        }

    }
}
