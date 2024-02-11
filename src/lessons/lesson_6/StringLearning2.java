package lessons.lesson_6;

import java.util.Arrays;

public class StringLearning2 {
    public static void main(String[] args) {
        // Immutable and replace method
        String badWordContainer = "bad, very bad sth else, bad!!";
        String filteredStr = badWordContainer.replace("bad", "***");
        System.out.println(filteredStr);

        // Substring , indexOf, split

        String url = "https://sdetpro.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));
        System.out.println(url.indexOf("https://"));

        System.out.println(Arrays.toString(url.split(":")));

        // RegularExpression | Regex
        String cookingTimeStr = "300mins";
        String minStr = cookingTimeStr.replaceAll("[^0-9]", "");
        System.out.println("minStr " + minStr);
        int cookingTime = Integer.valueOf(minStr);

        int cookingTime1 = Integer.parseInt(minStr);
        System.out.println(cookingTime1 +1);

        String[] wordList = {"   "};
        System.out.println("length = " + wordList[0].length());
    }
}
