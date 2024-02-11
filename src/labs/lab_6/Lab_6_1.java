package labs.lab_6;

import java.util.Scanner;

public class Lab_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String string = scanner.nextLine();
        System.out.println("The minutes in total is " + caculateMinutes(string));
    }

    private static int caculateMinutes(String string) {
        int minutesTotal = 0;
        if (!string.isEmpty()){
            String[] hourAndMinute = string.split("and");
            String hourString = hourAndMinute[0];
            String minuteString = hourAndMinute[1];
            int hours = getNumber(hourString);
            System.out.println("Hour: " + hours);
            int minutes = getNumber(minuteString);
            minutesTotal = hours * 60 + minutes;
        }
        return minutesTotal;
    }

    private static int getNumber(String string) {
        return Integer.valueOf(string.replaceAll("[^0-9]", ""));
    }
}
