package lessons.lesson_7;

public class Calculator {
    // Without params
    /*
    [ access modifier ] | class method/or NOT (optional) | return type | function's name
     */

    public static void welcome(String name){
        System.out.println("Welcome ".concat(name));
    }

    // Method signature
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    //Varargs | Rest parameters
//    public static int sum(int... nums){
//        if (nums.length < 2){
//            throw new IllegalArgumentException("At least 2 numbers");
//        }
//        int total = 0;
//        for (int value : nums) {
//            total += value;
//        }
//        return total;
//    }

    public static int sum(int loopNumber, int... nums){
        if (nums.length < 2){
            throw new IllegalArgumentException("At least 2 numbers");
        }
        int total = 0;
        for (int value : nums) {
            total += value;
        }
        return total;
    }
}
